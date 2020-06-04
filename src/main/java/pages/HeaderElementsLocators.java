package pages;

import org.openqa.selenium.By;

public class HeaderElementsLocators {
    public By headerPhonesButton = By.cssSelector("[class='header-phones__button']");
    public By headerPhone22 = By.cssSelector("[class='header-phones-i bold']");
    public By headerPhone80 = By.cssSelector("[class='header-phones-i ']");
    public By logoRozetka = By.cssSelector("[src='https://i.rozetka.ua/design/logo-dark.svg']");
    public By headerButtonFAQ = By.cssSelector( "[href='https://rozetka.com.ua/faq/']");
    public By headerButtonCredit = By.cssSelector("[href='https://rozetka.com.ua/credit/']");
    public By headerButtonPaymentsAndDeliveries = By.cssSelector("[href='https://rozetka.com.ua/payments-and-deliveries/']");
    public By headerButtonWarranty = By.cssSelector("[href='https://rozetka.com.ua/warranty/']");
    public By headerButtonContacts = By.cssSelector("[href='https://rozetka.com.ua/contacts/']");
    public By headerButtonStatusOrder = By.cssSelector("[id='status_orders']");
    public By headerButtonSellOnRozetka = By.cssSelector("[href='https://rozetka.com.ua/newseller/']");
    public By headerSelectCity = By.cssSelector("[id='city-chooser']");
    public By headerButtonLanguageRu = By.cssSelector("[class='lang-switcher-link active']");
    public By headerButtonLanguageUa = By.cssSelector("[class='lang-switcher-link whitelink'] [href='https://rozetka.com.ua/ua/']");
}
