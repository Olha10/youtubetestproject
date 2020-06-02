package testcases;

import org.testng.annotations.Test;
import pages.LogInPageLocators;
import testbase.TestBase;

public class LogInTests extends TestBase {
    public LogInPageLocators logInPageLocators = new LogInPageLocators();

    @Test (priority = 1)
    public void LogInTest () {
        elementsHelper.isElementVisible(logInPageLocators.logInButton,10);
    }
}
