package com.PageTestsPackage;

import com.BasePackage.BaseClass;
import com.PageClassPackage.HomePage;
import com.PageClassPackage.LaunchingPage;
import com.PageClassPackage.SignInPage;
import com.PageClassPackage.SignInPage2;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPage2Test extends BaseClass{

        HomePage homepage;
        SignInPage signinpage;
        SignInPage2 sign2;
        LaunchingPage launch;

        SignInPage2Test() {
            super();
        }

        @BeforeMethod
        public void setUp() {
            initialization();
            homepage = new HomePage();
            signinpage = new SignInPage();
            signinpage=homepage.validateSignIn();
            sign2=signinpage.validateSignIn2(prop.getProperty("email"));

        }

        @Test(priority = 1)
        public void SigninPage2TitleTest() {
            String title = signinpage.validateSignPageTitle();
            Assert.assertEquals(title, "Amazon Sign In",
                    " title not matched");
        }

        @Test(priority = 2)
        public void ValidateLoginBtn() {
            boolean btn = sign2.loginButton();
            Assert.assertTrue(btn);
        }

        @Test(priority = 3)
        public void validateFpasswod() {
            boolean fp = sign2.forgotPassword();
            Assert.assertTrue(fp);

        }

        @Test(priority = 4)
        public void Lo() {
            launch = sign2.validateSign2(prop.getProperty("pass"));

        }

    }



