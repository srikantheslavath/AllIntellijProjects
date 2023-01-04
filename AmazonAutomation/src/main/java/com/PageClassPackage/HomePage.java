package com.PageClassPackage;

import com.BasePackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy(xpath= "//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")
    WebElement FlagLogo;
    @FindBy(xpath= "//*[@id=\"nav-cart-count-container\"]/span[2]")
    WebElement CartIcon;
    @FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
    WebElement AmazonLogo;
    @FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
    WebElement SignIn;

    //initialize the page Objects:
    public HomePage(){

        PageFactory.initElements(driver,this);
    }

    //Action:features
    public String validateLoginPage1Title(){
        return driver.getTitle();
    }

    public boolean validateAmazonLogo(){
        return AmazonLogo.isDisplayed();
    }
    public boolean validateCartIcon(){
        return CartIcon.isDisplayed();
    }
    public boolean validateFlagLogo(){
        return FlagLogo.isDisplayed();
    }
    public SignInPage validateSignIn(){
        SignIn.click();
        return new SignInPage();
    }

}
