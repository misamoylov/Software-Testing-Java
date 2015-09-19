package addressbook.tests;

import org.testng.annotations.Test;
import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class EmptyGroupCreation extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroups();
	// save old state
	List<GroupData> oldList = app.getGroupHelper().getGroups();
	//actions
	GroupData group = new GroupData("","","");
    app.getGroupHelper().groupCreation();
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitButton();
    app.getGroupHelper().returnToGroupPage();
    //save new state
    List<GroupData> newList = app.getGroupHelper().getGroups();
    //compare states
    oldList.add(group);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }

}
