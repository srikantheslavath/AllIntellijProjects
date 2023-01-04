package com.PageTestsPackage;

import com.BasePackage.BaseClass;
import com.PageClassPackage.HomePage;
import com.PageClassPackage.SignInPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage homepage;
    SignInPage signinpage;
    HomePageTest() {
        super();
    }
    @BeforeMethod
    public void setUp()  {
        initialization();
        homepage=new HomePage();

    }

    @Test(priority = 1)
    public void HomepageTitleTest(){
        String title = homepage.validateLoginPage1Title();
        Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
                "HomePage title not matched");
    }
    @Test(priority = 2)
    public void  AmazonLogoTest(){
        boolean logo= homepage.validateAmazonLogo();
        Assert.assertTrue(logo);
    }
    @Test(priority = 3)
    public void validateFlag(){
      boolean flag = homepage.validateFlagLogo();
      Assert.assertTrue(flag);

    }


    @Test(priority = 4)
    public void validateLogin1Test(){
        signinpage= homepage.validateSignIn();

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}








