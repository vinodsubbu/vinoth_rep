import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class AssertionTest extends Test123{

    @Test
    void assertTest() throws InterruptedException {

        //Login to MyHCL
        WebDriverWait waitforpage0=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement email;
        email=waitforpage0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        email.sendKeys("vinothsubrama.laksh@hcl.com");
        WebElement nextbutton= driver.findElement(By.xpath("//input[@value='Next']"));
        nextbutton.click();
        WebDriverWait waitforpage=new WebDriverWait(driver,Duration.ofSeconds(10));;
        WebElement password;
        password=waitforpage.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        password.sendKeys("CreateH4pp!ness3");
        WebElement signin= driver.findElement(By.xpath("//input[@value='Sign in']"));
        signin.click();
        Thread.sleep(5000);
        WebDriverWait waitforpage1=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement remember= driver.findElement(By.xpath("//input[@value='Yes']"));
        remember.click();


        //Navigate to Global Claims System
        WebDriverWait waitforpage2=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement quicklinkTime= driver.findElement(By.xpath("//a[text()='Raise claim']"));
        quicklinkTime.click();

        String mainwindow=driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        Iterator<String> iterator=allwindows.iterator();

        while(iterator.hasNext()){

        }

    }
}
