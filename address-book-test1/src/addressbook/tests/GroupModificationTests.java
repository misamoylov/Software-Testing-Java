package addressbook.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
public class GroupModificationTests extends TestBase {
	@Test
	public void modifySomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroups();
		// save old state
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		//actions
		app.getGroupHelper().initGroupModification(0);
		GroupData group = new GroupData();
		group.name="new name";
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupModification(1);
		app.getGroupHelper().returnToGroupPage();
		//save new state
	    List<GroupData> newList = app.getGroupHelper().getGroups();
		 //compare states
	    oldList.remove(0);
		oldList.add(group);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}
}
