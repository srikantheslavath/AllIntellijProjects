package com.PageClassPackage;

import com.BasePackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPageClass extends BasePageClass {
    @FindBy(xpath= "//*[@id=\"main-nav\"]/div[3]/a/span")
    WebElement contactsLabel;
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")
    WebElement firstName;
    @FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[2]/div/div/input")
    WebElement lastName;
    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input")
    WebElement companyName;
    @FindBy(xpath= "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
    WebElement saveButton;

    public ContactsPageClass(){
        //initialization
        PageFactory.initElements(driver,this);
    }
    //Action
    public boolean verifyContactsLabel(){
        return contactsLabel.isDisplayed();
    }



    public void addContacts(String fname, String lname, String comp) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(firstName).build().perform();

        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        companyName.sendKeys(comp);
        saveButton.click();
    }
    public void verifyContactsByName(String name) throws InterruptedException {

        driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//..//..//..")).click();

    }
}

