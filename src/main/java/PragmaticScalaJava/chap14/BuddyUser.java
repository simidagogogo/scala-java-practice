
package PragmaticScalaJava.chap14;

import PragmaticScala.chap14.Buddy;
import PragmaticScala.chap14.Buddy$;

/**
 * @author zhangda
 * @date 2021/4/3 16:25
 * @note
 */
public class BuddyUser {
    public static void main(String[] args) {
        new Buddy().greet();
        Buddy$.MODULE$.greet();
    }
}
