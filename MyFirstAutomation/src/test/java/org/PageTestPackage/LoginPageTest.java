package org.PageTestPackage;

import PageClassPackage.HomePage;
import PageClassPackage.LandingPage;
import PageClassPackage.LoginPage;
import org.BasePackage.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginpage;
    HomePage homepage;

    public LoginPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        init();
        loginpage = new LoginPage();
        homepage = new HomePage();
    }

    @Test
    public void loginPageTitle() {
        String title = loginpage.verifyLoginTitle();
        Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
    }

    @Test
    public HomePage loginTest() {
        String un = prop.getProperty("username");
        String pwd = prop.getProperty("password");
        homepage = loginpage.login(un, pwd);
        String titleOfHomePage = homepage.verifyHomePageTitle();
        Assert.assertEquals(titleOfHomePage, "Cogmento CRM");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
