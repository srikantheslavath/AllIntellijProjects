package PageTestPackage;

import BaseClassPackage.BaseClass;
import PageclassPackage.HomePage;
import PageclassPackage.LandingPage;
import PageclassPackage.LoginPage;
import UtilsPackage.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseClass {
    HomePage home;
    LoginPage login;
    LandingPage land;
    Utils util;
    public LoginPageTest() {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        home=new HomePage();
        login=new LoginPage();
        land=new LandingPage();
        util =new Utils();
    }



}