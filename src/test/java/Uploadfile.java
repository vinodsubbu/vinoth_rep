import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class Uploadfile extends Test123{

    @Test
    void uploadFile() throws InterruptedException, AWTException {
//        WebElement uploadFilebutton= driver.findElement(By.id("myfile"));
//        uploadFilebutton.submit();
//        uploadFilebutton.sendKeys("/Users/vinothsubrama.laksh/Downloads");
//        driver.findElement(By.cssSelector())

        //click the upload file button or browse button
        WebElement element = driver.findElement(By.id("myfile"));
        element.sendKeys("/Users/vinothsubrama.laksh/Downloads/Dummy word doc.docx");
        Thread.sleep(4000);


        //import file
//        File file=new File("/Users/vinothsubrama.laksh/Downloads/Dummy word doc.docx");
//
//        StringSelection str = new StringSelection(file.getAbsolutePath());
//
//        //copy to clipboard
//        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//
//        clipboard.setContents(str, null);
//
//        //robot class to paste and find the file





//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_TAB);
////        Thread.sleep(2000);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_SHIFT);
//        robot.keyPress(KeyEvent.VK_G);
////        Thread.sleep(4000);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//        robot.keyRelease(KeyEvent.VK_G);
//
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_V);
////        Thread.sleep(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        Thread.sleep(500);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
