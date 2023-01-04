package PagePackage;

import BasePackage.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Baseclass {
    @FindBy(xpath = "//img[@id='logo']")
    WebElement wbllogo;
    @FindBy(xpath="//button[@id='headerfblogin']")
    WebElement freestudennt;
    @FindBy(xpath ="//a[@id='loginButton']")
    WebElement loginbtn;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public boolean CheckWBLogo(){
        return wbllogo.isDisplayed();
    }
    public boolean CheckFreeStudent(){
        return freestudennt.isDisplayed();
    }
    public LoginPage ClickLogin(){
        loginbtn.click();
        return new LoginPage(driver);
    }
}
