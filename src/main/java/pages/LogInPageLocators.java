package pages;

import org.openqa.selenium.By;

public class LogInPageLocators {
    public By inputFieldUserName = By.cssSelector("[name='session[username_or_email]']");
    public By inputFieldPassword = By.cssSelector("[name='session[password]']");
    public By buttonLogIn = By.cssSelector("[data-testid='LoginForm_Login_Button']");
}
