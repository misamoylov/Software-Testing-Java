package addressbook.tests;

import org.testng.annotations.Test;
import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;
public class NonEmptyGroupCreation extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroups();
	// save old state
	List<GroupData> oldList = app.getGroupHelper().getGroups();
	//actions
    app.getGroupHelper().groupCreation();
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header name 1";
    group.footer = "footer variable 1";
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
