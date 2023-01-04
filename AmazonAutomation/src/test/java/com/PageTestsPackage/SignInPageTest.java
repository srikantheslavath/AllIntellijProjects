package com.PageTestsPackage;

import com.BasePackage.BaseClass;
import com.PageClassPackage.HomePage;
import com.PageClassPackage.SignInPage;
import com.PageClassPackage.SignInPage2;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseClass {
    HomePage homepage;
    SignInPage signinpage;
    SignInPage2 sign2;

    SignInPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homepage = new HomePage();
        signinpage = new SignInPage();
        signinpage=homepage.validateSignIn();
    }

    @Test(priority = 1)
    public void SigninPageTitleTest() {
        String title = signinpage.validateSignPageTitle();
        Assert.assertEquals(title, "Amazon Sign In",
                " title not matched");
    }

    @Test(priority = 2)
    public void createaccount() {
        boolean acc = signinpage.validateCreateAcc();
        Assert.assertTrue(acc);
    }

    @Test(priority = 3)
    public void validatecontinue() {
        boolean cont = signinpage.validatecontinuebutn();
        Assert.assertTrue(cont);

    }

    @Test(priority = 4)
    public void Login2Test() {
        sign2 = signinpage.validateSignIn2(prop.getProperty("email"));

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}






