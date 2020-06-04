package testcases;

import org.testng.annotations.Test;
import pages.LogInPageLocators;
import testbase.TestBase;

public class LogInTests extends TestBase {
    public LogInPageLocators logInPageLocators = new LogInPageLocators();
    public String email = "100kravchenko@gmail.com";
    public String password = "Krava1098";

    @Test (priority = 1,groups = "test_base")
    public void LogInTest () {
        elementsHelper.clickOnVisibleAndClickableElement(logInPageLocators.buttonClosePopap,10);
        elementsHelper.clickOnVisibleAndClickableElement(logInPageLocators.accountButton,10);
        elementsHelper.textInputField(logInPageLocators.inputFieldEmail,10,email);
        elementsHelper.textInputField(logInPageLocators.inputFieldPassword,10,password);
        elementsHelper.clickOnVisibleAndClickableElement(logInPageLocators.buttonSignIn,10);
    }
}
