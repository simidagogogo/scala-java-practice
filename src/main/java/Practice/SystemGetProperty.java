package Practice;

import java.util.Map;
import java.util.Properties;

/**
 * @author zhangda
 * @date 2021/3/17 20:41
 * @note
 */

public class SystemGetProperty {

    public static void main(String[] args) {
        boolean WINDOWS = System.getProperty("os.name").startsWith("Windows");

        System.out.println("java.class.path = " +  System.getProperty("java.class.path"));
        // java.class.path = /Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/tools.jar:/Users/11102178/MyProgramTest/scala-java-practice/target/classes:/Users/11102178/.ivy2/cache/org.scala-lang/scala-reflect/jars/scala-reflect-2.11.12.jar:/Users/11102178/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.12.jar:/Users/11102178/.ivy2/cache/org.scala-lang/scala-reflect/srcs/scala-reflect-2.11.12-sources.jar:/Users/11102178/.ivy2/cache/org.scala-lang/scala-library/srcs/scala-library-2.11.12-sources.jar:/Users/11102178/.m2/repository/org/slf4j/slf4j-api/1.7.10/slf4j-api-1.7.10.jar:/Users/11102178/.m2/repository/com/google/guava/guava/18.0/guava-18.0.jar:/Users/11102178/.m2/repository/it/unimi/dsi/fastutil/7.2.0/fastutil-7.2.0.jar:/Users/11102178/.m2/repository/commons-cli/commons-cli/1.4/commons-cli-1.4.jar:/Users/11102178/.m2/repository/redis/clients/jedis/3.0.0/jedis-3.0.0.jar:/Users/11102178/.m2/repository/org/apache/commons/commons-pool2/2.4.3/commons-pool2-2.4.3.jar:/Users/11102178/.m2/repository/com/google/protobuf/protobuf-java/3.6.0/protobuf-java-3.6.0.jar:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar

        System.out.println("java.home = " +  System.getProperty("java.home"));
        // java.home = /Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre

        System.out.println("java.version = " +  System.getProperty("java.version"));
        // java.version = 1.8.0_231

        System.out.println("line.separator = " +  System.getProperty("line.separator"));
        // line.separator = \n

        System.out.println("os.name = " +  System.getProperty("os.name"));
        // os.name = Mac OS X

        System.out.println("os.version = " +  System.getProperty("os.version"));
        // os.version = 10.15.7

        System.out.println("path.separator = " +  System.getProperty("path.separator"));
        // path.separator = :

        System.out.println("security.destroy = " +  System.getProperty("security.destroy"));
        // security.destroy = null

        System.out.println("user.dir = " +  System.getProperty("user.dir"));
        // user.dir = /Users/11102178/MyProgramTest/scala-java-practice

        System.out.println("user.home = " +  System.getProperty("user.home"));
        // user.home = /Users/11102178

        System.out.println("user.name = " +  System.getProperty("user.name"));
        // user.name = 11102178

        System.out.println(WINDOWS);
        // false

        Properties properties = System.getProperties();
        System.out.println(properties);
        // {java.runtime.name=Java(TM) SE Runtime Environment,
        // sun.boot.library.path=/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib,
        // java.vm.version=25.231-b11,
        // gopherProxySet=false,
        // java.vm.vendor=Oracle Corporation,
        // java.vendor.url=http://java.oracle.com/,
        // path.separator=:,
        // java.vm.name=Java HotSpot(TM) 64-Bit Server VM,
        // file.encoding.pkg=sun.io,
        // user.country=CN,
        // sun.java.launcher=SUN_STANDARD,
        // sun.os.patch.level=unknown,
        // java.vm.specification.name=Java Virtual Machine Specification,
        // user.dir=/Users/11102178/MyProgramTest/scala-java-practice,
        // java.runtime.version=1.8.0_231-b11,
        // java.awt.graphicsenv=sun.awt.CGraphicsEnvironment,
        // java.endorsed.dirs=/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/endorsed,
        // os.arch=x86_64,
        // java.io.tmpdir=/var/folders/w8/vcmtpzp14nqgrxpfwg_dqpcxj3dkl_/T/,
        // line.separator= \n,
        // java.vm.specification.vendor=Oracle Corporation,
        // os.name=Mac OS X,
        // sun.jnu.encoding=UTF-8,
        // java.library.path=/Users/11102178/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.,
        // java.specification.name=Java Platform API Specification,
        // java.class.version=52.0,
        // sun.management.compiler=HotSpot 64-Bit Tiered Compilers,
        // os.version=10.15.7, user.home=/Users/11102178,
        // user.timezone=,
        // java.awt.printerjob=sun.lwawt.macosx.CPrinterJob,
        // file.encoding=UTF-8,
        // java.specification.version=1.8,
        // java.class.path=/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/lib/tools.jar:/Users/11102178/MyProgramTest/scala-java-practice/target/classes:/Users/11102178/.ivy2/cache/org.scala-lang/scala-reflect/jars/scala-reflect-2.11.12.jar:/Users/11102178/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.12.jar:/Users/11102178/.ivy2/cache/org.scala-lang/scala-reflect/srcs/scala-reflect-2.11.12-sources.jar:/Users/11102178/.ivy2/cache/org.scala-lang/scala-library/srcs/scala-library-2.11.12-sources.jar:/Users/11102178/.m2/repository/org/slf4j/slf4j-api/1.7.10/slf4j-api-1.7.10.jar:/Users/11102178/.m2/repository/com/google/guava/guava/18.0/guava-18.0.jar:/Users/11102178/.m2/repository/it/unimi/dsi/fastutil/7.2.0/fastutil-7.2.0.jar:/Users/11102178/.m2/repository/commons-cli/commons-cli/1.4/commons-cli-1.4.jar:/Users/11102178/.m2/repository/redis/clients/jedis/3.0.0/jedis-3.0.0.jar:/Users/11102178/.m2/repository/org/apache/commons/commons-pool2/2.4.3/commons-pool2-2.4.3.jar:/Users/11102178/.m2/repository/com/google/protobuf/protobuf-java/3.6.0/protobuf-java-3.6.0.jar:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar, user.name=11102178, java.vm.specification.version=1.8, sun.java.command=t1, java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre, sun.arch.data.model=64, user.language=zh, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.lwawt.macosx.LWCToolkit, java.vm.info=mixed mode, java.version=1.8.0_231, java.ext.dirs=/Users/11102178/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java, sun.boot.class.path=/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/jre/classes,
        // java.vendor=Oracle Corporation,
        // file.separator=/,
        // java.vendor.url.bug=http://bugreport.sun.com/bugreport/,
        // sun.io.unicode.encoding=UnicodeBig,
        // sun.cpu.endian=little,
        // sun.cpu.isalist=


        Map<String, String> env = System.getenv();
        System.out.println(env.toString());
        // PATH=/usr/local/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Library/Apple/usr/bin,
        // SHELL=/bin/zsh,
        // PAGER=less,
        // LSCOLORS=Gxfxcxdxbxegedabagacad,
        // OLDPWD=/Applications/IntelliJ IDEA CE.app/Contents/bin,
        // VISUAL=vim, USER=11102178, LANG=en_US.UTF-8,
        // ZSH=/Users/11102178/github/oh-my-zsh,
        // TMPDIR=/var/folders/w8/vcmtpzp14nqgrxpfwg_dqpcxj3dkl_/T/,
        // JAVA_MAIN_CLASS_60819=t1,
        // SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.i9syqpnz1q/Listeners,
        // XPC_FLAGS=0x0,
        // AUTOJUMP_SOURCED=1,
        // LC_ALL=en_US.UTF-8,
        // VERSIONER_PYTHON_VERSION=2.7,
        // __CF_USER_TEXT_ENCODING=0x6236CA6A:0x19:0x34,
        // LOGNAME=11102178, LESS=-R,
        // PWD=/Users/11102178/MyProgramTest/scala-java-practice,
        // XPC_SERVICE_NAME=com.jetbrains.intellij.ce.9412,
        // AUTOJUMP_ERROR_PATH=/Users/11102178/Library/autojump/errors.log,
        // HOME=/Users/11102178}
    }
}
