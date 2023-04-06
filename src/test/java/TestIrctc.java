import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestIrctc extends Test123{

    @Test
        void testIrctc() throws InterruptedException {

           Thread.sleep(7000);
           WebElement loginbutton= driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
           loginbutton.click();
           WebElement username= driver.findElement(By.xpath("//input[@placeholder='User Name']"));
           username.sendKeys("Vino3194");
           WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
           password.sendKeys("V!no29993");
          Thread.sleep(10000);
          WebElement signinbutton= driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]"));
          signinbutton.click();
      }
}
