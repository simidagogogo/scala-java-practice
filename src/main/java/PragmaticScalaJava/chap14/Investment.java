/**
 * @author zhangda
 * @date 2021/4/3 10:50
 * @note
 */

package PragmaticScalaJava.chap14;

public class Investment {
    private String investmentName;
    private InvestmentType investmentType;

    public Investment(String name, InvestmentType type) {
        investmentName = name;
        investmentType = type;
    }
    public int yield() {
        return 0;
    }
}
