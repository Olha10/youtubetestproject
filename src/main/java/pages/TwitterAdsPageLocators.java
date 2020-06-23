package pages;

import org.openqa.selenium.By;

public class TwitterAdsPageLocators {
    public By selectCountry = By.cssSelector("[name='country']");
    public By selectCountryUkraine = By.xpath("//select[@name='country']//option[contains(text(),'Ukraine')]");
}
