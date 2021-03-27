package PragmaticScalaJava.chap04;

/**
 * @author zhangda
 * @date 2021/3/17 00:14
 * @note
 */
public class Car {
    public Car(int yearOfMake) {
        year = yearOfMake;
    }

    private final int year;
    private int miles;

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public void drive(int distance) {
        miles += Math.abs(distance);
    }
}
