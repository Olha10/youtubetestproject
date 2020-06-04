package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderElementsLocators;
import testbase.TestBase;

public class HeaderElementsTests extends TestBase {
    HeaderElementsLocators headerElementsLocators = new HeaderElementsLocators();

    @Test (priority = 1,groups = "test_base")
    public void HeaderPhoneTest () {
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerElementsLocators.headerPhone22,10),"(044) 537-02-22,");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerElementsLocators.headerPhone80,10),"(044) 503-80-80");
    }
    @Test (priority = 2,groups = "test_base")
    public void HeaderLogoRozetkaTest () {
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.logoRozetka,10));
    }
    @Test(priority = 3,groups = "test_base")
    public void SelectedRuLanguageTest () {
        Assert.assertTrue(elementsHelper.isElementSelected(headerElementsLocators.headerButtonLanguageRu,10));
    }

    @Test(priority = 4,groups = "test_base")
    public void HeaderButtonsTest () {
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.headerButtonFAQ,10));
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.headerButtonCredit,10));
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.headerButtonPaymentsAndDeliveries,10));
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.headerButtonWarranty,10));
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.headerButtonContacts,10));
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.headerButtonStatusOrder,10));
        Assert.assertTrue(elementsHelper.isElementClickable(headerElementsLocators.headerButtonSellOnRozetka,10));
    }
    @Test (priority = 5,groups = "test_base")
    public void SelectCityTest (){
        elementsHelper.clickOnVisibleAndClickableElement(headerElementsLocators.headerSelectCity,10);
    }
}
