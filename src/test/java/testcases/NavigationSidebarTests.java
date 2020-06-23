package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationMoreMenuLocators;
import pages.NavigationSidebarLocators;
import pages.TwitterAdsPageLocators;
import testbase.TestBase;

import java.util.ArrayList;

public class NavigationSidebarTests extends TestBase {
    NavigationSidebarLocators navigationSidebarLocators = new NavigationSidebarLocators();
    NavigationMoreMenuLocators navigationMoreMenuLocators = new NavigationMoreMenuLocators();
    TwitterAdsPageLocators twitterAdsPageLocators = new TwitterAdsPageLocators();

    @Test(priority = 1, groups = "test_base")
    public void NavigationButtonTest() {
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonMainPage, 10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonHomePage, 10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonExplorePage, 10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonNotificationsPage, 10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonMessagesPage, 10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonBookmarksPage, 10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonListsPage, 10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonProfilePage, 10);
    }

    @Test(priority = 2, groups = "test_base")
    public void NavigationMoreMenuButtonTest() {
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonMoreMenu, 10);
        Assert.assertTrue(elementsHelper.isElementClickable(navigationMoreMenuLocators.linkTopics, 10), "linkTopics should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(navigationMoreMenuLocators.linkMoments, 10), "linkMoments should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(navigationMoreMenuLocators.linkTwitterAds, 10), "linkTwitterAds should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(navigationMoreMenuLocators.linkAnalytics, 10), "linkAnalytics should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(navigationMoreMenuLocators.linkSettingsAndPrivacy, 10), "linkSettingsAndPrivacy should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(navigationMoreMenuLocators.linkHelpCenter, 10), "linkHelpCenter should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(navigationMoreMenuLocators.linkDisplay, 10), "linkDisplay should be clickable");
    }

    @Test(priority = 3,groups = "test_base")
    public void TwitterAdsPage () {
        String oldTab = driver.getWindowHandle();
        elementsHelper.clickOnVisibleAndClickableElement(navigationMoreMenuLocators.linkTwitterAds,10);
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        elementsHelper.clickOnVisibleAndClickableElement(twitterAdsPageLocators.selectCountry,10);
        elementsHelper.clickOnVisibleAndClickableElement(twitterAdsPageLocators.selectCountryUkraine,5);
        driver.close();
        driver.switchTo().window(oldTab);
        elementsHelper.clickOnVisibleAndClickableElement(navigationSidebarLocators.buttonMoreMenu,10);
        elementsHelper.clickOnVisibleAndClickableElement(navigationMoreMenuLocators.linkAnalytics,10);
    }
}
