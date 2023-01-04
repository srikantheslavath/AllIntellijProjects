package com.PageClassPackage;

import com.BasePackage.BasePageClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 extends BasePageClass {

        //PageFactory:OR
        @FindBy(xpath= "//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
        //@CacheLookup //-store the webElement in Cache memory
                WebElement Login;
        @FindBy(xpath= "//*[@id=\"navbar-collapse\"]/ul/li[2]/a")
        WebElement SignUp;
        @FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")    //deliberately making error in xpath(instead of 'home' giving 'homes'
        WebElement FreeCrmLogo;

        //initialize the page Objects:
        public LoginPage1(){

            PageFactory.initElements(driver,this);
        }

        //Action:features
        public String validateLoginPage1Title(){
            return driver.getTitle();
        }
        

        public boolean validateFreeCrmLogo(){
            return FreeCrmLogo.isDisplayed();
        }

        public LoginPage2 validateLogin2(){
            Login.click();
            return new LoginPage2();
        }

    }


