package addressbook.tests;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ContactRemovalTest extends TestBase {
	@Test
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		//save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();
		Random rnd = new Random ();
		int index = rnd.nextInt(oldList.size()-1);
		app.getContactHelper().deleteContact(3);
		app.getNavigationHelper().goToHomePage();
		//save new state
		List<ContactData> newList = app.getContactHelper().getContacts();
		oldList.remove(index);
		//compare states
		Collections.sort(oldList); 
		Collections.sort(newList);
		assertEquals(newList,oldList);
	}
}
