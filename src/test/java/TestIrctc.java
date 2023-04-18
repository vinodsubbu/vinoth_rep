import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestIrctc extends Test123{

    @Test
        void testIrctc() throws InterruptedException {

//           Thread.sleep(7000);
        WebDriverWait waitforlogin=new WebDriverWait(driver, Duration.ofSeconds(15));
           WebElement loginbutton;
           loginbutton= waitforlogin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'LOGIN')]")));
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
