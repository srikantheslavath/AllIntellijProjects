package PageClassPackage;

import org.BasePackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
LandingPage landingpage;
LoginPage loginpage;
    @FindBy(xpath="")
    WebElement username;
    @FindBy(xpath="//*[contains(@type,'pass')]")
    WebElement password;
    @FindBy(xpath= "//*[@class= 'ui fluid large blue submit button']")
    WebElement LoginBtn;
    @FindBy(xpath = "//*[@id=\"ui\"]/div/div/div[3]/a")
    WebElement signup;
    @FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
    WebElement error;

    public LoginPage() {
        PageFactory.initElements(driver, this);
        landingpage =new LandingPage();
    }

    public String verifyLoginTitle() {
        return driver.getTitle();
    }

    public HomePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        LoginBtn.click();
        return new HomePage();
    }

}

