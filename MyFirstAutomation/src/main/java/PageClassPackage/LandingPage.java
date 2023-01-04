package PageClassPackage;

import org.BasePackage.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseTest {
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/a/img")
    WebElement logo;
    @FindBy(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
    static
    WebElement login;
    @FindBy(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[2]/a")
    WebElement signin;

    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public String VerifyTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean verifyLogo() {
        boolean dlogo = logo.isDisplayed();
        return dlogo;
    }

    public boolean verifyLoginButton() {
        boolean isLogin = login.isDisplayed();
        return isLogin;
    }

    public static LoginPage login1() {
        login.click();
        return new LoginPage();
    }
}



