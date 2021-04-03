import PragmaticScala.chap14.BirdWithProblem;
import PragmaticScala.chap14.NoFlyException;

/**
 * @author zhangda
 * @date 2021/4/3 16:54
 * @note
 */
public class Penguin extends BirdWithProblem {
    public void fly() throws NoFlyException {
        throw new NoFlyException();
    }
}
