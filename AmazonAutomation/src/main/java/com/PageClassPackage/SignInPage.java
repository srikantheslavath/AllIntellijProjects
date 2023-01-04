package com.PageClassPackage;

import com.BasePackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass {
    @FindBy(xpath="//*[@id=\"ap_email\"]")
    WebElement email1;
    @FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
    WebElement createAccount;
    @FindBy(xpath= "//*[@id=\"continue\"]")
    WebElement con;

    public SignInPage(){

        PageFactory.initElements(driver,this);
    }

    //Action:features

    public String validateSignPageTitle(){
        return driver.getTitle();
    }

    public boolean validatecontinuebutn(){
        return con.isDisplayed();
    }

    public boolean validateCreateAcc(){
        return createAccount.isDisplayed();
    }


    public SignInPage2 validateSignIn2(String email){
        email1.sendKeys(email);
        con.click();
        return new SignInPage2();
    }

}


