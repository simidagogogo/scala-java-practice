import PragmaticScala.chap14.Printable; // // 导入Scala中的接口
import PragmaticScala.chap14.Printable$class; // // 导入Scala中的抽象类

/**
 * @author zhangda
 * @date 2021/4/3 15:01
 * @note 如果特质具有方法实现，那么scala编译器将会创建两部分内容：
 *      1. 一个具有抽象方法声明的接口-Printable.class
 *      2. 以及一个包含实现的对应抽象类-Printable$class.class（从2.12.x开始，对于只包含方法实现而不包含字段的特质将会被编译为带有默认方法的接口）。
 *      如果只是想在Java中进行实现该接口，没问题。但是对于具有实现的特质来说，那就有点棘手了，但也是少许的工作量。
 */
public class APrintable implements Printable {
    @Override
    public void print() {
        System.out.println("We can reuse the trait here if we like...");

        // 调用了特质中的实现(第2点)
        Printable$class.print(this); // 2.11.x
        Printable.super.print(); // 2.12.x
    }

    public static void use(Printable printable) {
        printable.print(); // 调用了特质中的虚方法(第1点), 该虚方法最终在APrintable类中被实现
    }

    public static void main(String[] args) {
        APrintable aPrintable = new APrintable();
        use(aPrintable); // 将Java类的实例作为特质的实例来使用

        System.out.println("---------------");

        Printable printable = new APrintable();
        use(printable);
    }
}
