package addressbook.tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
public class GroupRemovalTests extends TestBase{
	@Test
	public void deleteSomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroups();
		// save old state
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		//actions
		app.getGroupHelper().deleteGroup(0);
		app.getGroupHelper().returnToGroupPage();
		//save new state
		List<GroupData> newList = app.getGroupHelper().getGroups();
	    //compare states
		oldList.remove(0);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}
	

}
