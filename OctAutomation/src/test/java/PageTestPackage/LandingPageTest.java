package PageTestPackage;

import BasePackage.Baseclass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends Baseclass {
    HomePage hp;
    LoginPage lp;
    LandingPage land;

    public LandingPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        hp = new HomePage(driver);
        lp = new LoginPage(driver);
        land = new LandingPage(driver);
        hp.ClickLogin();
        lp.Loginmethod(prop.getProperty("username"), prop.getProperty("password") );
        land = lp.ClickSubmit();
    }
    @AfterMethod
    public void teardown(){
        driver.close();
    }
    @Test
    public void TestWbl(){
        boolean wb = land.checkWBL();
        Assert.assertTrue(wb);
    }

    @Test
    public void TestM(){
        boolean mail = land.checkmailid();
        Assert.assertTrue(mail);
    }
}
