package addressbook.tests;
import org.testng.annotations.Test;

public class ContactRemovalTest extends TestBase {
	@Test
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().deleteContact(3);
		app.getNavigationHelper().goToHomePage();
	}
}
