package PageTestPackage;

import BaseClassPackage.BaseClass;
import PageclassPackage.HomePage;
import PageclassPackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends BaseClass {
    HomePage home;
    LoginPage login;

    public HomePageTest() {

        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        home = new HomePage();
        login = new LoginPage();
    }

    @Test(priority = 1)
    public void HomePageTitleTest() {
        String title = home.validateHomePageTitle();
        Assert.assertEquals(title, "QA/QE/SDET Training.",
                "LoginPage1 title not matched");
    }

    @Test(priority = 2)
    public void ValidateWblTest() {
        boolean wbl1 = home.Validatewbl();
        Assert.assertTrue(wbl1);
    }

    @Test(priority = 3)
    public void ValidateTwitTest() {
        boolean twit = home.ValidateTwitter();
        Assert.assertTrue(twit);
    }

    @Test(priority = 4)
    public void ValidateLoginTest() {
        login = home.ValidateLoginBtn();
    }


}
