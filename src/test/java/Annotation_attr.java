import org.testng.annotations.Test;

public class Annotation_attr {
    @Test
    public void abcd()
    {
        System.out.println("This is test case1");
    }
    @Test
    public void verify()
    {
        System.out.println("This is test case2");
    }
    @Test(dependsOnMethods = {"verify", "check1"})
    public void check0()
    {
        System.out.println("This is test case3");
    }

    @Test
    public void check1()
    {
        System.out.println("This is tc0");
    }
}
