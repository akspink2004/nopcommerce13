package com.nopcommerce13.pages;

import com.nopcommerce13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;


    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    WebElement topmenulink;

    @FindBy(linkText = "Computers ")
    WebElement computerbutton;

    @FindBy(linkText = "My account")
    WebElement myaccountbutton;


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("clicking on login link : "+ loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("click on register link :"+registerLink.toString());
    }
    public void clickOnTopmenu(){
        clickOnElement(topmenulink);
        log.info("click on top menubar :"+topmenulink.toString());
    }
    public void clickOnComputer(){
        clickOnElement(computerbutton);
        log.info("click on computer button :"+computerbutton.toString());
    }
    public void clickOnMyaccount(){
        clickOnElement(myaccountbutton);
        log.info("click on my account button :"+myaccountbutton.toString());
    }

}
