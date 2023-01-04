package com.TestPagePackage;

import com.BasePackage.BasePageClass;
import com.PageClassPackage.ContactsPageClass;
import com.PageClassPackage.HomePage3;
import com.PageClassPackage.LoginPage1;
import com.PageClassPackage.LoginPage2;
import com.UtilityPackage.UtilityClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ContactsPage4TestClass extends BasePageClass{

    LoginPage1 loginpage1;
    LoginPage2 loginpage2;
    HomePage3 homepage;
    ContactsPageClass contactsLink;
    UtilityClass testUtil;

    public ContactsPage4TestClass(){
        super();

    }
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        testUtil =new UtilityClass();
        loginpage1=new LoginPage1();
        loginpage2= loginpage1.validateLogin2();
        loginpage2 =new LoginPage2();
        contactsLink = new ContactsPageClass();
        homepage= loginpage2.validateLogin1(prop.getProperty("username"),prop.getProperty("password"));


    }

    @Test(priority = 1)
    public void verifyContactsLabelTest(){
        Assert.assertTrue(contactsLink.verifyContactsLabel(),"contact label is missing on the page");
    }


    @DataProvider
    public Object[][] getFreeCRMTestData(){
        Object data[][] = UtilityClass.getExcelData("FreeCRMtestData.xlsx","Sheet1" );
        return data;
    }

    @Test(priority = 2,dataProvider =  "getFreeCRMTestData")
    public void validateAddContact(String firstName, String lastName, String company) throws InterruptedException {
        homepage.clickOnAddContacts();
        //contactsLink.addContacts("Angel","sts","Facebook");
        contactsLink.addContacts(firstName,lastName,company);
    }
    @Test(priority = 3)
    public void verifyContactsByNameTest() throws InterruptedException {
        contactsLink.verifyContactsByName("srikanth");

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}




