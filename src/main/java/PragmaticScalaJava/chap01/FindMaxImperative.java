package PragmaticScalaJava.chap01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  zhangda
 * @date    2021/3/12 23:58
 * @note    寻找最大的温度
 */
public class FindMaxImperative {

    public static int findMax(List<Integer> temperatures) {
        int highTemperature = Integer.MIN_VALUE;
        for (int temperature : temperatures) {
            highTemperature = Math.max(highTemperature, temperature);
        }
        return highTemperature;
    }

    public static void main(String[] args) {
        List<Integer> tep = new ArrayList<Integer>();
        tep.add(10);
        tep.add(20);
        tep.add(18);
        System.out.println(findMax(tep));
    }
}
