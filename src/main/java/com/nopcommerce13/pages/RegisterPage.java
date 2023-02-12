package com.nopcommerce13.pages;

import com.nopcommerce13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='ico-register']" )
    WebElement registerlink;

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;



    @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input")
    WebElement genderButton;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailfield;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordfield;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpasswordfield;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    public void clickOnRegisterLink(){
        clickOnElement(registerlink);
    }
    public String verifyRegisterText(){
        log.info("getting text from : "+registerText.toString());
        return getTextFromElement(registerText);
    }
    public void clickOnGenderCheckbox(){
        clickOnElement(genderButton);
    }
    public void enterFristName(String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterSecondName(String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void selectday(int value){
        selectByIndexFromDropDown(day,value);
    }
    public void selectmonth(int value){
        selectByIndexFromDropDown(month,value);
    }
    public void selectyear(int value){
        selectByIndexFromDropDown(year,value);
    }
    public void enterEmail(String email){
        sendTextToElement(emailfield,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordfield,password);
    }
    public void enterConfirmPassword(String cpassword){
        sendTextToElement(confirmpasswordfield,cpassword);
    }
    public void clickOnregisterButton(){
        clickOnElement(registerButton);
    }

}
