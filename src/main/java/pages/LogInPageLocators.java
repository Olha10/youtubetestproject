package pages;

import org.openqa.selenium.By;

public class LogInPageLocators {
    public By accountButton = By.xpath("//a[@class='header-topline__user-link link-dashed']");
    public By inputFieldEmail = By.cssSelector("[id='auth_email']");
    public By inputFieldPassword = By.cssSelector("[id='auth_pass']");
    public By buttonSignIn = By.cssSelector("[class='button button_size_large button_color_green auth-modal__submit']");
}
