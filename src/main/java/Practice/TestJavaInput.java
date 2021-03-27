package Practice;

import java.util.Scanner;

/**
 * @author zhangda
 * @date 2020/9/27
 * @note    控制台输入
 */

public class TestJavaInput {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("name");
        String name = scanner.nextLine();

        System.out.println("age");
        int age = scanner.nextInt();

        System.out.println("salary");
        double salary = scanner.nextDouble();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
    }
}
