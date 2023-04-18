import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class PriorityExample {

    @Test(priority = 2)
    void testThird(){
        System.out.println("This method will be printed third");
    }

    @Test(priority = 1)
    void testSecond() {
        System.out.println("This method will be printed first");
    }

    @Test(priority = -1)
    void testFirst(){
        System.out.println("This method goes second");
    }
}
