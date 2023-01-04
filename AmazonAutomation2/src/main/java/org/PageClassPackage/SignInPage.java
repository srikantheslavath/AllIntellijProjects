package org.PageClassPackage;

import com.google.common.annotations.VisibleForTesting;
import org.BasePackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass {
@FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement user;
@FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement con;
@FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
    WebElement createAcc;
@FindBy(xpath="//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span")
    WebElement need;

public SignInPage(){
    PageFactory.initElements(driver,this);
}

public String ValidateSignInPageTitle(){
    return driver.getTitle();
}

public boolean validatecontinue(){
    return con.isDisplayed();
}
public boolean validatecreateacc(){
    return createAcc.isDisplayed();
}
public boolean validateneedhelp(){
    return need.isDisplayed();
}
public SignInPage1 validateSign1(String username){
    user.sendKeys(username);
    con.click();
    return new SignInPage1();
}

}
