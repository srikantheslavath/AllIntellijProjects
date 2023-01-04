package PageclassPackage;

import BaseClassPackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"loginButton\"]")
    WebElement login;
    @FindBy(xpath = "//*[@id=\"wblhead\"]")
    WebElement wbl;
    @FindBy(xpath = "/html/body/header/div[1]/div/ul/li[1]/a/i")
    WebElement twitter;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String validateHomePageTitle() {
        return driver.getTitle();
    }


        public boolean Validatewbl() {
            return wbl.isDisplayed();
        }
        public boolean ValidateTwitter() {
            return twitter.isDisplayed();
        }
    public  LoginPage ValidateLoginBtn() {
        login.click();
        return new LoginPage();
    }
    }

