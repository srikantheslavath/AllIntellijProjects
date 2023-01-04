package PagePackage;

import BasePackage.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
    @FindBy(id= "username")
    WebElement user;
    @FindBy(id ="password")
    WebElement pass;
    @FindBy(id="login")
    WebElement submit;
    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void Loginmethod(String un, String pwd){
        user.sendKeys(un);
        pass.sendKeys(pwd);
    }
    public LandingPage ClickSubmit(){
        submit.click();
        return new LandingPage(driver);
    }
}
