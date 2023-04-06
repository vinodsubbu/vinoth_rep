import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestDummy extends Test123{

    @Test
        void testSauce(){
//          driver.navigate().to("https://www.google.com");


           WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
           WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
           WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
           username.sendKeys("standard_user");
           password.sendKeys("secret_sauce");
           login.click();
           String pagetitle= driver.getTitle();
           if (pagetitle.equals("Swag Labs")){
               System.out.println("Login success");
           }
           else{
               System.out.println("Failed");
           }


  }
}
