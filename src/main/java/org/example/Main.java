package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {

        WebDriver driver;// =new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");
//        driver.navigate().forward();
        driver.navigate().back();

        driver.get("https://www.facebook.com");
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("l.v.subramanian94@gmail.com");
        WebElement pass=driver.findElement(By.id("pass"));
        pass.sendKeys("Vinoth@64570");
        WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();
//        System.out.println("Hello world!");

       // driver.close();
        driver.quit();
    }
}