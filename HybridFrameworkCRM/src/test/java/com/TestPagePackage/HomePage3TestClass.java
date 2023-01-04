package com.TestPagePackage;

import com.BasePackage.BasePageClass;
import com.PageClassPackage.ContactsPageClass;
import com.PageClassPackage.HomePage3;
import com.PageClassPackage.LoginPage1;
import com.PageClassPackage.LoginPage2;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage3TestClass extends BasePageClass {

    LoginPage1 loginpage1;
    LoginPage2 loginpage2;
    HomePage3 homepage;
    ContactsPageClass contactsLink;

    public HomePage3TestClass(){
        super();
    }
    //testcases should be separated - independent
    //before every testcase -launch the browser and login
    //@Test - execute testcase
    //after every testcase -close the browser
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        loginpage1=new LoginPage1();
        loginpage2=loginpage1.validateLogin2();
        loginpage2 =new LoginPage2();
        contactsLink = new ContactsPageClass();
        homepage= loginpage2.validateLogin1(prop.getProperty("username"),prop.getProperty("password"));
    }

    @Test(priority=1)
    public void homepageTitleTest() {
        String title = homepage.verifyHomePageTitle();
        Assert.assertEquals(title, "Cogmento CRM","HomePage title not matched");
    }
    @Test(priority = 2)
    public void verifyUsernameLabelTest(){
        Assert.assertTrue(homepage.verifyUsernameLabel());
    }
    @Test(priority = 3)
    public void verifyContactsLinkTest(){
        contactsLink = homepage.clickOnContactsLink();
    }

    @Test(priority = 4)
    public void clickOnAddContactsTest() throws InterruptedException {
        contactsLink= homepage.clickOnAddContacts();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

