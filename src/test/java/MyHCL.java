import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class MyHCL extends Test123{

    @Test
    void bookTime() {


//        Thread.sleep(7000);
        WebDriverWait waitforpage0=new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement email =driver.findElement(By.xpath("//input[@type='email']"));
        WebElement email;
        email=waitforpage0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        email.sendKeys("vinothsubrama.laksh@hcl.com");
        WebElement nextbutton= driver.findElement(By.xpath("//input[@value='Next']"));
        nextbutton.click();

        WebDriverWait waitforpage=new WebDriverWait(driver,Duration.ofSeconds(10));
//        Thread.sleep(7000);

//        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        WebElement password;
        password=waitforpage.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        password.sendKeys("CreateH4pp!ness3");

        WebElement signin= driver.findElement(By.xpath("//input[@value='Sign in']"));
        signin.click();

        WebDriverWait waitforpage1=new WebDriverWait(driver,Duration.ofSeconds(10));
//        Thread.sleep(15000);

        WebElement remember= driver.findElement(By.xpath("//input[@value='Yes']"));
        remember.click();

        WebDriverWait waitforpage2=new WebDriverWait(driver,Duration.ofSeconds(10));
//        Thread.sleep(7000);

        WebElement quicklinkTime= driver.findElement(By.xpath("//a[text()='Book timesheet']"));
        quicklinkTime.click();

//        driver.switchTo().newWindow(WindowType.TAB);

//        Thread.sleep(7000);





       String mainWindow= driver.getWindowHandle();
       System.out.println(mainWindow);
       Set<String> allWindow=driver.getWindowHandles();
        Iterator<String> iterator=allWindow.iterator();


        while(iterator.hasNext()){
            String childwindow=iterator.next();
            if(!mainWindow.equalsIgnoreCase(childwindow)){
                driver.switchTo().window(childwindow);
                WebElement title= driver.findElement(By.xpath("//title"));
                System.out.print("Child window is "+driver.getTitle());
            }
        }
        WebElement itimebutton= driver.findElement(By.xpath("//button[text()='CONTINUE TO ITIME']"));
        itimebutton.click();

    }
}
