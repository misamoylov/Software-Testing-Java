package addressbook.tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactCreation extends TestBase {
	@DataProvider	
	public Iterator<Object[]> randomValidContactGenerator(){
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++){
			ContactData contact = new ContactData();
			contact.firstname = generateRandomString();
		    contact.lastname = generateRandomString();
		    contact.address11 = generateRandomString();
		    contact.hometel = generateRandomString();
		    contact.mobiletel = generateRandomString();
		    contact.worktel = generateRandomString();
		    contact.email = generateRandomString();
		    contact.secondemail = generateRandomString();
		    //contact.birthday = generateRandomString();
		    contact.group = generateRandomString();
		    //contact.birthmonth = generateRandomString();
		    contact.birthyear = generateRandomString();
		    contact.secondphone = generateRandomString();
		    contact.secondaddress = generateRandomString();
			list.add(new Object[]{contact});
		}
		return list.iterator();
	}
	
	public String generateRandomString() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0){
			return "";
		}
		else {
			return "test" + rnd.nextInt();
		}
	}
	  @Test(dataProvider = "randomValidContactGenerator")
	  public void ContactCreationWithValidData(ContactData contact) throws Exception {
		app.getNavigationHelper().openMainPage();
		//save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();
		//actions
	    app.getContactHelper().createContact();
		app.getContactHelper().contactFormFilling(contact);
	    app.getContactHelper().contactSubmitButton();
	    app.getNavigationHelper().goToHomePage();
	  //save new state
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    //compare states
	    oldList.add(contact);
	    Collections.sort(oldList);
	    //assertEquals(newList, oldList);
}
}