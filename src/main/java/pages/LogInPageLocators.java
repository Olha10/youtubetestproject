package pages;

import org.openqa.selenium.By;

public class LogInPageLocators {
    public By accountButton = By.cssSelector("[name='signin']");
    public By inputFieldEmail = By.cssSelector("[name='login']");
    public By inputFieldPassword = By.cssSelector("[name='password']");
    public By buttonSignIn = By.cssSelector("[name='auth_submit']");
    public By buttonClosePopap = By.cssSelector("[class='popup-close-medium-icon sprite']");
}
