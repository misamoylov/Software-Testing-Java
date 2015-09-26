package addressbook.tests;
import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
	@Test(dataProvider = "randomValidContactGenerator")
	public void modifySomeContact(ContactData contact){
		app.getNavigationHelper().openMainPage();
		//save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();
		Random rnd = new Random();
		int index = rnd.nextInt(oldList.size()-1);
		//actions
		app.getContactHelper().initContactModification(index);
		app.getContactHelper().contactFormFilling(contact);
		app.getContactHelper().submitContactModification();
		app.getNavigationHelper().goToHomePage();
		//save new state
	    List<ContactData> newList = app.getContactHelper().getContacts();
		 //compare states
	    oldList.remove(index);
		oldList.add(contact);
		Collections.sort(oldList);
		Collections.sort(newList);
		assertEquals(newList, oldList);
	}
}
