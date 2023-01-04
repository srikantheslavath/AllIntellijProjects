package org.PageClassPackage;

import org.BasePackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage1 extends BaseClass {
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"auth-fpp-link-bottom\"]")
    WebElement Fpassword;
    @FindBy(xpath="//*[@id=\"signInSubmit\"]")
    WebElement sign;

    public SignInPage1(){
        PageFactory.initElements(driver,this);
    }

    public String validatetitelofSignin2(){
        return driver.getTitle();
    }
public boolean validateforgetpassword(){
        return Fpassword.isDisplayed();
}
public boolean Validatesigninbtn(){
     return sign.isDisplayed();
}
public LaunchingPage validatesignin2(String pass){
        password.sendKeys(pass);
        sign.click();
        return new LaunchingPage();

}
}
