package PageTestPackage;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import UtilityPackage.Utils;
import org.openqa.selenium.By;
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
        Object data[][] = Utils.getExcelData("logindata.xlsx","Tabelle1" );
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


