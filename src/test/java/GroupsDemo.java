import org.testng.annotations.Test;

public class GroupsDemo {

    @Test(groups= {"Fruits"})
    public void apple()
    {
        System.out.println("Apple");
    }
    @Test(groups = {"Fruits"})
    public void mango()
    {
        System.out.println("Mango");
    }
    @Test(groups= {"Fruits"})
    public void orange()
    {
        System.out.println("Orange");
    }
    @Test
    public void onion()
    {
        System.out.println("Onion");
    }
    @Test
    public void potato()
    {
        System.out.println("Potato");
    }
}
