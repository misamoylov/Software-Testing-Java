package addressbook.tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.testng.annotations.Test;

public class AddContact extends TestBase {
  
  @Test
  public void testAddContact() throws Exception {
	app.getNavigationHelper().openMainPage();
	//save old state
	List<ContactData> oldList = app.getContactHelper().getContacts();
	//actions
    app.getContactHelper().createContact();
    ContactData contact = new ContactData();
    contact.firstname = "Evgeny";
    contact.lastname = "Kaspersky1";
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
	app.getContactHelper().contactFormFilling(contact);
    app.getContactHelper().contactSubmitButton();
    app.getNavigationHelper().goToHomePage();
  //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
    //compare states
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }
}
