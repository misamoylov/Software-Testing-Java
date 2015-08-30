package addressbook.tests;

import org.testng.annotations.Test;

public class EmptyContactCreation extends TestBase {
	 @Test
	  public void testAddEmptyContact() throws Exception {
			app.getNavigationHelper().openMainPage();
		    app.getContactHelper().createContact();
		    app.getContactHelper().contactFormFilling(new ContactData("", "", "", "", "", "", "", "", "-", "", "-", "", "", ""));
		    app.getContactHelper().contactSubmitButton();
		    app.getNavigationHelper().goToHomePage();
		  }
}
