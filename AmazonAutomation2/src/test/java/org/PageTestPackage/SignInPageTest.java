package org.PageTestPackage;

import org.BasePackage.BaseClass;
import org.PageClassPackage.HomePage;
import org.PageClassPackage.SignInPage;
import org.PageClassPackage.SignInPage1;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseClass {
    HomePage homepage;
    SignInPage signinpage;
    SignInPage1 signinpage1;

SignInPageTest(){
    super();
}
  @BeforeMethod
  public void setUp(){
    initialization();
    homepage =new HomePage();
    signinpage=new SignInPage();
 signinpage=homepage.validateSignIn();

  }

  @Test(priority = 1)
    public void SignInPageTitleTest(){
   String title= signinpage.ValidateSignInPageTitle();
      Assert.assertEquals(title,"Amazon Sign In");
  }

  @Test(priority = 2)
public void validateContinueTest(){
 boolean cont=   signinpage.validatecontinue();
 Assert.assertTrue(cont);
  }

  @Test(priority = 3)
    public void validateCreateAccTest(){
  boolean acc=  signinpage.validatecreateacc();
  Assert.assertTrue(acc);
  }
  @Test(priority = 4)
    public void validateNeedHelp(){
    boolean ne =signinpage.validateneedhelp();
    Assert.assertTrue(ne);
  }
@Test(priority = 5)
    public void signInPageTest2(){
    signinpage1=signinpage.validateSign1(prop.getProperty("username"));
}
@AfterMethod
    public void tearDown(){
    driver.quit();
}
}
