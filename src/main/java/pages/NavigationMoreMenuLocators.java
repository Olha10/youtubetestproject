package pages;

import org.openqa.selenium.By;

public class NavigationMoreMenuLocators {
  public By linkTopics =
          By.xpath("//a[@role='link']//*[contains(text(),'Topics')]");
  public By linkMoments =
          By.xpath("//body/div[@id='react-root']/div[@class='css-1dbjc4n r-13awgt0 r-12vffkv']/div[@class='css-1dbjc4n r-13awgt0 r-12vffkv']/div[@class='r-1d2f490 r-u8s1d r-zchlnj r-ipm5af r-184en5c']/div[@class='css-1dbjc4n r-1d2f490 r-105ug2t r-u8s1d r-zchlnj r-ipm5af']/div[@class='css-1dbjc4n r-1pz39u2 r-16y2uox r-1wbh5a2']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-14lw9ot r-1f0042m r-1upvrn0 r-1ekmkwe r-1udh08x r-1rnoaur r-1r851ge r-1xcajam']/div/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[2]/a[1]/div[1]");
  public By linkTwitterAds = By.cssSelector("[href='https://ads.twitter.com/?ref=gl-tw-tw-twitter-ads-rweb']");
  public By linkAnalytics = By.cssSelector("[href='https://analytics.twitter.com/']");
  public By linkSettingsAndPrivacy = By.cssSelector("[href='/settings']");
  public By linkHelpCenter = By.cssSelector("[href='https://support.twitter.com/']");
  public By linkDisplay = By.cssSelector("[href='/i/display']");
}
