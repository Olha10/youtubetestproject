package pages;

import org.openqa.selenium.By;

public class ContactPhonesAndSchedulePopapLocators {
    public By headerTextContactPhones = By.cssSelector("[class='modal__heading']");
    public By textConsultationsAndOrderByPhone = By.xpath("//single-modal-window//div[1]//p[1]");
    public By textOtherSellers = By.xpath("//single-modal-window//p[2]");
    public By textCallCenterSchedule = By.xpath("//p[contains(text(),'call-')]");
    public By telephoneNumber22 = By.xpath("[href='tel:+38 (044) 537-02-22']");
    public By telephoneNumber80 = By.xpath("[href='tel:+38 (044) 503-80-80']");
    public By telephoneNumber79 = By.xpath("[href='tel:+38 044 502-10-79']");
    public By textDuringWeekdays = By.xpath("//single-modal-window//dt[1]");
    public By textSaturday = By.xpath("//single-modal-window//dt[2]");
    public By textSunday = By.xpath("//single-modal-window//dt[3]");
    public By buttonClose = By.xpath("[class='modal__close']");
}
