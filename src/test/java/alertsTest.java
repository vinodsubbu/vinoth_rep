import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class alertsTest extends Test123{


    @Test
    public void alertHandling1(){
//        driver.get("www.naukri.com");
//        System.out.println("This is test method");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button1= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        button1.click();
        Alert alertFirst=driver.switchTo().alert();

        String alertMsg=alertFirst.getText();
        System.out.println(alertMsg);
        alertFirst.accept();

        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement button2= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        button2.click();
        Alert alertSecond=driver.switchTo().alert();
        String alertMsg2=alertSecond.getText();
        System.out.println(alertMsg2);
        alertSecond.dismiss();


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        button3.click();
        Alert alertThird = driver.switchTo().alert();
        String alertMsg3 = alertThird.getText();
        System.out.println(alertMsg3);
        alertThird.sendKeys("Sample text goes here");

    }
}
