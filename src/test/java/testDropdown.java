import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testDropdown extends Test123{

    @Test(description = "This method is for multi select")
 void selectTest() throws InterruptedException {
        //select one option out of the available dropdown options


        //select multiple options in multidropdown
        WebElement multiDropdown=driver.findElement(By.id("owc"));
        Select selectMulti=new Select(multiDropdown);
        selectMulti.selectByIndex(1);
        Thread.sleep(4000);
        selectMulti.selectByIndex(2);
//        Thread.sleep(4000);
    }

    @Test (description = "This method is normal select")
    void anotherTest(){
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='option']"));
        Select selectOption=new Select(dropdown);
        selectOption.selectByIndex(0);
        selectOption.selectByValue("option 2");
        selectOption.selectByVisibleText("Option 3");
    }
}
