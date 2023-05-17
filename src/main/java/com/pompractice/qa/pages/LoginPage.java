package com.pompractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
    WebElement mobileNum;

//    @FindBy(xpath = "")
//    WebElement password;

    @FindBy(xpath = "//button[contains(text(), 'Request OTP')]")
    WebElement reqOTPBtn;


    public void login(){
        mobileNum.sendKeys("9901364570");
        reqOTPBtn.click();

    }
}
