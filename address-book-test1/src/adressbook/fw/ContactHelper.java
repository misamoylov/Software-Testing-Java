package adressbook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import addressbook.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void contactSubmitButton() {
		//	//submit contact creation
			click(By.name("submit"));
		}

	public void createContact() {
		// contact creation
		click(By.linkText("add new"));
	}

	public void contactFormFilling(ContactData contact) {
		// contact form filling
		type("firstname", contact.firstname);
	    type("lastname", contact.lastname);
	    type("address", contact.address11);
	    type("home", contact.hometel);
	    type("mobile", contact.mobiletel);
	    type("work", contact.worktel);
	    type("email", contact.email);
	    type("email2", contact.secondemail);
	    type("byear", contact.birthyear);
	    selectByText(By.name("bday"), contact.birthday);
	    selectByText(By.name("bmonth"), contact.birthmonth);
	    selectByText(By.name("new_group"), contact.group);
	    type("phone2", contact.secondphone);
	    type("address2", contact.secondaddress);
	  
	}

	

}
