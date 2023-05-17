package com.pompractice.qa.base;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase   {
        static WebDriver driver;
        static Properties prop;
           public TestBase(){
                try{
                    prop=new Properties();
                    FileInputStream fi=new FileInputStream("/Users/vinothsubrama.laksh/eclipse-workspace/POMPractice/src/main/java/com/pompractice"+"/qa/config.properties");
                    prop.load(fi);
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
           }
}
