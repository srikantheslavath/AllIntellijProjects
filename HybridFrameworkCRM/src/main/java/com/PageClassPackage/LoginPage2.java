package com.PageClassPackage;

import com.BasePackage.BasePageClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BasePageClass{

        //Define Object Repository
        @FindBy(name="email")
        WebElement username;
        @FindBy(xpath="//input[@placeholder='Password']")
        WebElement password;
        @FindBy(linkText ="//*[@id=\"ui\"]/div/div/form/div/div[3]")
        WebElement LoginBtn;

        //initialize the page Objects:
        public LoginPage2(){
            PageFactory.initElements(driver,this);
        }

        //Action:features
        public String validateLoginPage2Title(){
            return driver.getTitle();
        }

        public HomePage3 validateLogin1(String un,String pwd) throws InterruptedException {

            Thread.sleep(1000);
            username.sendKeys(un);
            Thread.sleep(1000);
            password.sendKeys(pwd);
            Thread.sleep(2000);
            LoginBtn.click();
            Thread.sleep(2000);
            return new HomePage3();
        }
    }

