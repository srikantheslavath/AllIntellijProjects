package org.PageTestPackage;

import PageClassPackage.LandingPage;
import org.BasePackage.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest {
    LandingPage landingpage;
    public LandingPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        init();
        landingpage=new LandingPage();
    }

    @Test
    public void testTitle() {

        String actual = landingpage.VerifyTitle();
        String expected = "Free CRM software for customer relationship management, sales, marketing campaigns and support.";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLandingPageLogo() {

        boolean islogo = landingpage.verifyLogo();
        Assert.assertTrue(islogo);
    }

    @Test
    public void testLoginButton() {

        boolean islogin = landingpage.verifyLoginButton();
        LandingPage.login1();
        Assert.assertTrue(islogin);
    }


    public void TearDown() {
        driver.close();
    }
}