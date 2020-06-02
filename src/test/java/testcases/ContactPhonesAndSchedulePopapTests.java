package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactPhonesAndSchedulePopapLocators;
import pages.HeaderElementsLocators;
import testbase.TestBase;

public class ContactPhonesAndSchedulePopapTests extends TestBase {
    HeaderElementsLocators headerElementsLocators = new HeaderElementsLocators();
    ContactPhonesAndSchedulePopapLocators contactPhonesAndSchedulePopapLocators = new ContactPhonesAndSchedulePopapLocators();

    @Test (priority = 1,groups = "test_base")
    public void ContactPhonesAndSchedulePopapTest (){
        elementsHelper.clickOnVisibleAndClickableElement(headerElementsLocators.headerPhonesButton,10);
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopapLocators.headerTextContactPhones,10),"Контактные телефоны");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopapLocators.textConsultationsAndOrderByPhone,10),"Консультации и заказ по телефонам");
        Assert.assertTrue(elementsHelper.isElementClickable(contactPhonesAndSchedulePopapLocators.telephoneNumber22,10),"telephone number -22 should be clickable");
        Assert.assertTrue(elementsHelper.isElementClickable(contactPhonesAndSchedulePopapLocators.telephoneNumber80,10),"telephone number -80 should be clickable");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopapLocators.textOtherSellers,10),"Другие продавцы:");
        Assert.assertTrue(elementsHelper.isElementClickable(contactPhonesAndSchedulePopapLocators.telephoneNumber79,10),"telephone number -79 should be clickable");

        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(contactPhonesAndSchedulePopapLocators.textCallCenterSchedule,10),"График работы call-центра:");
    }

}
