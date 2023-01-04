package com.TestPagePackage;

import com.BasePackage.BasePageClass;
import com.PageClassPackage.HomePage3;
import com.PageClassPackage.LoginPage1;
import com.PageClassPackage.LoginPage2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginPage2TestClass extends BasePageClass {
    LoginPage1 loginpage1;
    LoginPage2 loginpage2;
    HomePage3 homePage3;


    LoginPage2TestClass() throws IOException {
        super();
    }

    @BeforeMethod

    public void setUp() throws InterruptedException {
        initialization();

        loginpage1 = new LoginPage1();
        loginpage2 = loginpage1.validateLogin2();
        homePage3=loginpage2.validateLogin1(prop.getProperty("username"),prop.getProperty("password") );
    }

    @Test(priority = 1)
    public void loginPage2TitleTest() {
        String title = loginpage2.validateLoginPage2Title();

        Assert.assertEquals(title, "Cogmento CRM", "LoginPage2 title not matched");
    }


    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

