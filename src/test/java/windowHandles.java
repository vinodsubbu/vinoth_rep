import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class windowHandles extends Test123{

    @Test
    void testWindow(){

         String parentwindow= driver.getWindowHandle();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement remotebutton=driver.findElement(By.xpath("//a[@title='Remote']"));
         remotebutton.click();
         driver.switchTo().newWindow(WindowType.TAB);
         String newtabtitle= driver.getTitle();
         driver.switchTo().window(parentwindow);
         String parenttabtitle=driver.getTitle();
         System.out.println("Parent tab is "+parenttabtitle +"and child tab is" +newtabtitle);

 }
}
