package com.PageClassPackage;

import com.BasePackage.BasePageClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage3 extends BasePageClass {

    //Page object
    @FindBy(xpath = "//span[contains(text(),'nitha sa')]")
    WebElement usernameLabel;//vikas ip
    @FindBy(xpath= "//span[contains(text(),'Contacts')]")
    WebElement contactsLink;//contacts
    @FindBy(xpath= "//i[@class='users icon']")
    WebElement contactsIcon;//icon
    @FindBy(xpath= "//*[@id=\"main-nav\"]/div[3]/button")
    WebElement addContact;//add button
    @FindBy(xpath= "//span[contains(text(),'Deals')]")
    WebElement dealsLink;
    @FindBy(xpath= "//span[contains(text(),'Tasks')]")
    WebElement tasksLink;

    //Initializing the PageObject
    public HomePage3(){
        PageFactory.initElements(driver,this);
    }
    //Actions
    public boolean verifyUsernameLabel(){
        return usernameLabel.isDisplayed();
    } //vikas

    public String verifyHomePageTitle(){
        return driver.getTitle();
    } //cognito CRM

    public ContactsPageClass clickOnContactsLink(){     //CLICKING ON CONTACTS
        contactsLink.click();
        return new ContactsPageClass();  }

    public ContactsPageClass clickOnAddContacts() throws InterruptedException {
        Thread.sleep(5000);
        contactsIcon.click();
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(addContact).build().perform();
        Thread.sleep(5000);
        addContact.click();
        return new ContactsPageClass();
    }

    public DealsPageClass clickOnDealsLink(){
        contactsLink.click();
        return new DealsPageClass();
    }



}