package PageTestPackage;

import BasePackage.Baseclass;
import PagePackage.HomePage;
import PagePackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Baseclass {
    HomePage hp;


    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        hp = new HomePage(driver);

    }
    @AfterMethod
    public void Teardown(){
        driver.close();

    }


    @Test
    public void TestLogo(){
        boolean logo = hp.CheckWBLogo();
        Assert.assertTrue(logo);
        loger.info("correct");
    }
    @Test
    public void TestFreeStudent(){
        boolean student = hp.CheckFreeStudent();
        Assert.assertTrue(student);
    }
    @Test
    public void ClickLogin(){
        hp.ClickLogin();

    }
}
