package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = By.id("user-name");
    By password = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By actualMessage = By.xpath("//div[@class='inventory_item']");
    By actualMessage3 = By.xpath("//span[contains(text(),'Products')]");

    public void enterUserName(String text) {
        sendTextToElement(username,text);
    }
    public void enterPassword(String text) {
        sendTextToElement(password,text);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String actualErrorMessage() {
        return getTextFromElement(actualMessage);
    }
public String actualErrorMessage1() {
        return getTextFromElement(actualMessage3);
}
}
