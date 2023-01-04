package com.PageClassPackage;

import com.BasePackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage2 extends BaseClass {

    @FindBy(xpath="//*[@id=\"ap_password\"]")
    WebElement password;
    @FindBy(xpath="//*[@id=\"signInSubmit\"]")
    WebElement loginBtn;
    @FindBy(xpath= "//*[@id=\"auth-fpp-link-bottom\"]")
    WebElement FPassword;

    public SignInPage2(){

        PageFactory.initElements(driver,this);
    }

    //Action:features

    public String validateSignPageTitle(){
        return driver.getTitle();
    }

    public boolean loginButton(){
        return loginBtn.isDisplayed();
    }

    public boolean forgotPassword(){
        return FPassword.isDisplayed();
    }


    public LaunchingPage validateSign2(String pass){
        password.sendKeys(pass);
        loginBtn.click();
        return new LaunchingPage();
    }
}
