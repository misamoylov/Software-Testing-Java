package addressbook.tests;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
	@Test
	public void modifySomeContact(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModification(11);
		ContactData contact1 = new ContactData();
		contact1.firstname="Mikhail";
		app.getContactHelper().contactFormFilling(contact1);
		app.getContactHelper().submitContactModification(11);
		app.getNavigationHelper().goToHomePage();
	}
}
