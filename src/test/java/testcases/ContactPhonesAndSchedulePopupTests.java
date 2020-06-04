package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactPhonesAndSchedulePopupLocators;
import pages.HeaderElementsLocators;
import testbase.TestBase;

public class ContactPhonesAndSchedulePopupTests extends TestBase {
    HeaderElementsLocators headerElementsLocators = new HeaderElementsLocators();
    ContactPhonesAndSchedulePopupLocators contactPhonesAndSchedulePopupLocators = new ContactPhonesAndSchedulePopupLocators();

    @Test (priority = 1,groups = "test_base")
    public void ContactPhonesAndSchedulePopapTest (){
        elementsHelper.clickOnVisibleAndClickableElement(headerElementsLocators.headerPhonesButton,10);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopupLocators.headerTextContactPhones,10),"Контактные телефоны");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopupLocators.textConsultationsAndOrderByPhone,10),"Консультации и заказ по телефонам");
        Assert.assertTrue(elementsHelper.isElementClickable(contactPhonesAndSchedulePopupLocators.phoneNumber22,10),"telephone number -22 should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(contactPhonesAndSchedulePopupLocators.phoneNumber80,10),"telephone number -80 should be clickable");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopupLocators.textOtherSellers,10),"Другие продавцы:");
        Assert.assertTrue(elementsHelper.isElementClickable(contactPhonesAndSchedulePopupLocators.phoneNumber79,10),"telephone number -79 should be clickable");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopupLocators.textCallCenterSchedule,10),"График работы call-центра:");
    }

}
