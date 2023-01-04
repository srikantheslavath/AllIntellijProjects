package org.PageClassPackage;

import org.BasePackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {


    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")
    WebElement flag;
    @FindBy(xpath = "//*[@id=\"nav-logo-sprites\"]")
    WebElement logo;
    @FindBy(xpath = "//*[@id=\"nav-cart-count-container\"]/span[2]")
    WebElement icon;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement signIn;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String ValidateHomePageTitle() {
        return driver.getTitle();
    }

    public boolean validateFlag() {
        return flag.isDisplayed();
    }

    public boolean validateAmazonLogo() {
        return logo.isDisplayed();

    }

    public boolean validateCarticon() {
        return icon.isDisplayed();
    }

    public SignInPage validateSignIn() {
        signIn.click();
        return new SignInPage();
    }


}

