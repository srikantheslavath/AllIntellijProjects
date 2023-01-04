package com.PageTestPackage;

import com.BasePackage.BaseClass;
import com.PageClassPackage.HomePage;
import com.PageClassPackage.LandingPage;
import com.PageClassPackage.LoginPage;
import com.UtilityPackage.Utils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    HomePage homePage;
    LoginPage login;
    LandingPage land;

    LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void SetUp(){
        initialization();
        homePage=new HomePage();
        login=new LoginPage();
        login=homePage.VerifyLoginBtn();

    }
    @Test(priority = 1)
    public void VerifyLoginTitleTest(){
        String title =login.VerifyLoginTitle();
        Assert.assertEquals(title,"QA/QE/SDET Training.","incorrect title");
    }
    @Test(priority =2)
    public void VerifyRegisterbtn(){
        boolean btn=login.verifyRegister();
        Assert.assertTrue(btn);
    }
    @DataProvider
    public Object[][] LoginDataDriven(){
        Object data[][] = Utils.getExcelData("logindata1.xlsx","Tabelle1" );
        return data;
    }

    @Test(priority = 3,dataProvider =  "LoginDataDriven")
    public void LoginDataTest(String username ,String password){
        login.loginmethod(username,password);


    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
}


