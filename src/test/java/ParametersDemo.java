import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

    @Test
    @Parameters({"val1", "val2"})
    public void Sum(int p1, int p2) {
        int finalsum = p1 + p2;
        System.out.println("The sum of passed values is " + finalsum);
    }

    @Test
    @Parameters ({"val1", "val2"})
    public void Diff(int q1, int q2) {
        int finaldiff = q1 -q2;
        System.out.println("The difference between passed values is " + finaldiff);
    }
}
