package adressbook.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import addressbook.tests.ContactData;
import addressbook.tests.GroupData;

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
	    selectByText(By.name("bday"), contact.birthday);
	    selectByText(By.name("bmonth"), contact.birthmonth);
	    type("byear", contact.birthyear);
	    //selectByText(By.name("new_group"), contact.group);
	    type("phone2", contact.secondphone);
	    type("address2", contact.secondaddress);
	  
	}

	public void deleteContact(int index) {
		selectContactByIndex(index);
		click(By.xpath("(//input[@name='update'])[2]"));
	}
	
	private void selectContactByIndex(int index) {
		click(By.xpath("(//img[@alt='Edit'])[" + index + "]"));
		//click(By.xpath("//tr[@name='entry'][" + index + "]"));
	}

	public void initContactModification(int index) {
		selectContactByIndex(index);
	}

	public void submitContactModification() {
		click(By.name("update"));
		
	}
	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		int numberRows = driver.findElements(By.xpath("//tr[@name='entry']")).size();
		for (int i = 0; i < numberRows; i++) {
			ContactData contact = new ContactData();
			contact.firstname  = driver.findElement(By.xpath("//tr[@name='entry']["+(i+1)+"]/td[3]")).getText();
			contact.lastname  =  driver.findElement(By.xpath("//tr[@name='entry']["+(i+1)+"]/td[2]")).getText();
			contacts.add(contact);
		}
		return contacts;
 	}
	

}
