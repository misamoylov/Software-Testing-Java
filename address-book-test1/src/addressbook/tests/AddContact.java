package addressbook.tests;

import org.testng.annotations.Test;

public class AddContact extends TestBase {
  
  @Test
  public void testAddContact() throws Exception {
	openMainPage();
    createContact();
    ContactData contact = new ContactData();
    contact.firstname = "Evgeny";
    contact.lastname = "Kaspersky";
    contact.address11 = "Moscow";
    contact.hometel = "911";
    contact.mobiletel = "199";
    contact.worktel = "02";
    contact.email = "kaspersky@mail.ru";
    contact.secondemail = "evgeny@mail.ru";
    contact.birthday = "11";
    contact.group = "test";
    contact.birthmonth = "October";
    contact.birthyear = "1999";
    contact.secondphone = "03";
    contact.secondaddress = "USA";
	contactFormFilling(contact);
    submitButton();
    goToHomePage();
  }
}
