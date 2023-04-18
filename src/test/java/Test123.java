import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Test123 {
    WebDriver driver;

   @BeforeTest
         void beforeTest() {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get("https://www.naukri.com");
//            driver.get("https://www.myhcl.com");


            driver.get("https://trytestingthis.netlify.app/");
//             driver.get("https://www.irctc.co.in");
             //driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            //driver.get("https://www.saucedemo.com/");

}

@AfterTest
      void afterTest(){
//         driver.close();
//         driver.quit();
  }
}
