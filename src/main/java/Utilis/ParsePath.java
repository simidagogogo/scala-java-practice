package Utilis;

import java.util.regex.Pattern;

/**
 * @author zhangda
 * @date 2021/3/17 20:32
 * @note org.apache.hadoop.fs.Path 中的源码, 如何解析url
 *
 *      例如: https://gitlab.vmic.xyz:zd%40233619/1110xxxx/data_develop.git
 *
 *         https://github.com/simidagogogo/scala-java-practice.git
 *         scheme = https
 *         authority = github.com
 *         path = /simidagogogo/scala-java-practice.git
 *
 *      梳理过程:
 *      step1.
 *      step2.
 *
 *
 */

public class ParsePath {

    /** 判断是否为windows操作系统 */
    static boolean WINDOWS = System.getProperty("os.name").startsWith("Windows");

    /** 这个正则该怎么用? */
    static Pattern hasDriveLetterSpecifier = Pattern.compile("^/?[a-zA-Z]:");

    // static方法中不能使用非静态的方法或者变量
    // Non-static field 'WINDOWS' cannot be referenced from a static context
    private static boolean hasWindowsDrive(String path) {
        return (WINDOWS && hasDriveLetterSpecifier.matcher(path).find());
    }


    /**
     * 检查路径是否有效
     *
     * @param path
     * @throws IllegalArgumentException
     */
    private void checkPathArg(String path) throws IllegalArgumentException {
        // disallow construction of a Path from an empty string
        if (path == null) {
            throw new IllegalArgumentException("Can not create a Path from a null string");
        }

        if (path.length() == 0) {
            throw new IllegalArgumentException("Can not create a Path from an empty string");
        }
    }

    /**
     * 解析URL
     *
     * @param pathString url
     * @throws IllegalArgumentException
     */
    public void parse(String pathString) throws IllegalArgumentException {
        checkPathArg(pathString);

        // add a slash in front of paths with Windows drive letters
        if (hasWindowsDrive(pathString) && pathString.charAt(0) != '/') {
            pathString = "/" + pathString;
        }

        // parse uri components （uri元素包括两部分：scheme 和 authority）
        String scheme = null;
        String authority = null;

        int start = 0;

        // parse uri scheme, if any
        int colon = pathString.indexOf(':');
        int slash = pathString.indexOf('/');

        if ((colon != -1) &&
                ((slash == -1) || (colon < slash))) {     // has a scheme
            scheme = pathString.substring(0, colon);
            start = colon + 1;
        }

        // parse uri authority, if any
        if (pathString.startsWith("//", start) && (pathString.length() - start > 2)) {       // has authority
            // 这里很关键, 跳过了//, 寻找下一个/
            int nextSlash = pathString.indexOf('/', start + 2);

            // 判断下一个/是否存在
            int authEnd = nextSlash > 0 ? nextSlash : pathString.length();
            authority = pathString.substring(start + 2, authEnd);
            start = authEnd;
        }

        // uri path is the rest of the string -- query & fragment not supported
        String path = pathString.substring(start, pathString.length());

        System.out.println("=====================");
        System.out.println("scheme = " + scheme + "\n" + "authority = " + authority + "\n" + "path = " + path);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        ParsePath p2 = new ParsePath();
        p2.parse(("file:///foo/bar"));
        p2.parse(("file://simidagogogo:zd%402222/foo/bar"));
        p2.parse(("file://simidagogogo:zd%402222@"));
        p2.parse(("https://github.com/simidagogogo/scala-java-practice.git"));
    }
}
