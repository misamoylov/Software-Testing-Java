package adressbook.fw;

import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import addressbook.tests.GroupData;

public class GroupHelper extends HelperBase{

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void groupCreation() {
		// init group creation
		 click(By.name("new"));
	}

	public void submitButton() {
	//	//submit group creation
		 click(By.name("submit"));
	}
	public void returnToGroupPage() {
		//return to group page
		click(By.linkText("group page"));
	}

	public void fillGroupForm(GroupData group) {
		// fill group form
	    type("group_name", group.name);
	    type("group_header", group.header);
	    type("group_footer", group.footer);
	}

	public void deleteGroup(int index) {

		selectGroupByIndex(index);
		click(By.name("delete"));
	}


	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) + "]"));
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}

	public void submitGroupModification(int i) {
		click(By.name("update"));
		
	}
	public List<GroupData> getGroups() {
		List<GroupData> groups = new ArrayList<GroupData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes)
		{
			GroupData group = new GroupData();
			String title = checkbox.getAttribute("title");
			group.name = title.substring("Select (".length(), title.length() - ")".length());
			groups.add(group);
		}
		return groups;
	}
}
