package addressbook.tests;

import org.testng.annotations.Test;

public class EmptyContactCreation extends TestBase {
	 @Test
	  public void testAddEmptyContact() throws Exception {
			openMainPage();
		    createContact();
		    contactFormFilling(new ContactData("", "", "", "", "", "", "", "", "-", "", "", "-", "", ""));
		    submitButton();
		    goToHomePage();
		  }
}
