package com.nopcommerce13.testsuite;

import com.nopcommerce13.pages.HomePage;
import com.nopcommerce13.pages.LoginPage;
import com.nopcommerce13.pages.RegisterPage;
import com.nopcommerce13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RgisterPageTest extends TestBase {

        RegisterPage register;
        HomePage homePage;

        @BeforeMethod
        public void inIt(){
            register = new RegisterPage();
            homePage = new HomePage();
        }

        @Test
        public void userNavigateToRegisterPageSuccessFully(){
            homePage.clickOnLoginLink();
            homePage.clickOnRegisterLink();
            String actualMessage= register.verifyRegisterText();
            String expectedMessage = "Register";
            Assert.assertEquals(actualMessage,expectedMessage,"Register verfied");
        }

        @Test
        public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
            homePage.clickOnLoginLink();
            homePage.clickOnRegisterLink();
            register.clickOnregisterButton();

//            String actualMessage1=register.verifyfirstNameError();
//            String expedctedMessage1 = "First name is required.";
//            Assert.assertEquals(actualMessage1,expedctedMessage1,"Error verified");
//
//            String actualMessage2=register.verifyLastNameError();
//            String expedctedMessage2 = "Last name is required.";
//            Assert.assertEquals(actualMessage2,expedctedMessage2,"Error verified");
//
//            String actualMessage3=register.verifyemailErrorr();
//            String expedctedMessage3 = "Email is required.";
//            Assert.assertEquals(actualMessage3,expedctedMessage3,"Error verified");
//
//            String actualMessage4=register.verifyPasswordErrorr();
//            String expedctedMessage4 = "Password is required.";
//            Assert.assertEquals(actualMessage4,expedctedMessage4,"Error verified");
//
//            String actualMessage5=register.verifyConfirmPasswordErrorr();
//            String expedctedMessage5 = "Password is required.";
//            Assert.assertEquals(actualMessage5,expedctedMessage5,"Error verified");
        }

        @Test
        public void verifyThatUserShouldCreateAccountSuccessfully() {
            homePage.clickOnLoginLink();
            homePage.clickOnRegisterLink();
            register.clickOnGenderCheckbox();
            register.enterFristName("Rajja1");
            register.enterSecondName("patel");
            register.selectday(4);
            register.selectmonth(8);
            register.selectyear(1908);
            register.enterEmail("raja1@gmail.com");
            register.enterPassword("123456");
            register.enterConfirmPassword("123456");
            register.clickOnregisterButton();
//            String actualMessage= register.verifyRegisterCompleted();
//            String expectedMessage = "Your registration completed";
//            Assert.assertEquals(actualMessage,expectedMessage,"Registration complete verfied");
        }


}
