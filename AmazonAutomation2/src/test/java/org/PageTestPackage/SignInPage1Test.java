package org.PageTestPackage;

import org.BasePackage.BaseClass;
import org.PageClassPackage.HomePage;
import org.PageClassPackage.LaunchingPage;
import org.PageClassPackage.SignInPage;
import org.PageClassPackage.SignInPage1;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPage1Test extends BaseClass {
    HomePage homePage;
    SignInPage signinpage;
    SignInPage1 signinpage1;
    LaunchingPage launch;

    SignInPage1Test() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        signinpage = new SignInPage();
        signinpage = homePage.validateSignIn();
        signinpage1 = signinpage.validateSign1(prop.getProperty("username"));

    }

    @Test(priority = 1)
    public void signinpage2TitleTest() {
        String title = signinpage1.validatetitelofSignin2();
        Assert.assertEquals(title, "Amazon Sign In");
    }

    @Test(priority = 2)
    public void validatesigninbtnTest() {
        boolean btn = signinpage1.Validatesigninbtn();
        Assert.assertTrue(btn);
    }

    @Test(priority = 3)
    public void validateForgotPasswordTest() {
        boolean Fpass = signinpage1.validateforgetpassword();
        Assert.assertTrue(Fpass);
    }

    @Test(priority = 4)
    public void validateSignIn2Test() {
        launch = signinpage1.validatesignin2(prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}