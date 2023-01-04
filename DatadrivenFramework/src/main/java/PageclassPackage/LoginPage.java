package PageclassPackage;

import BaseClassPackage.BaseClass;
import UtilsPackage.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class LoginPage extends BaseClass {

        @FindBy(xpath = "//*[@id=\"loginbyfb\"]")
        WebElement freestudentAccess;
        @FindBy(xpath = "//*[@id=\"username\"]")
        WebElement username;
        @FindBy(xpath="//*[@id=\"password\"]")
        WebElement pass;
        @FindBy(xpath="//*[@id=\"login\"]")
        WebElement loginbtn;
        @FindBy(xpath="//*[@id=\"loginButton\"]")
        WebElement login;
        public LoginPage() {
            PageFactory.initElements(driver, this);
        }
        public String validateHomePageTitle() {
            return driver.getTitle();
        }

    public void loginCredentialsFromPropFile() throws InterruptedException {
        login.click();
        username.sendKeys(prop.getProperty("userName"));
        pass.sendKeys(prop.getProperty("password"));
        loginbtn.click();
    }


    public void fromExcelDataInvalidCredential() throws IOException, InterruptedException {
        login.click();
        String [][]data=Utils.getExcelData();
        username.sendKeys(data[2][0]);
        pass.sendKeys(data[2][1]);
        loginbtn.click();

    }


}
