package testcases;

import org.testng.annotations.Test;
import pages.LogInPageLocators;
import testbase.TestBase;

public class LogInTests extends TestBase {
    public LogInPageLocators logInPageLocators = new LogInPageLocators();
    public String username = "OlhaKravchenko1";
    public String password = "krava1098";

    @Test (priority = 1,groups = "test_base")
    public void LogInTest () {
        elementsHelper.textInputField(logInPageLocators.inputFieldUserName,10,username);
        elementsHelper.textInputField(logInPageLocators.inputFieldPassword,10,password);
        elementsHelper.clickOnVisibleAndClickableElement(logInPageLocators.buttonLogIn,10);
    }
}
