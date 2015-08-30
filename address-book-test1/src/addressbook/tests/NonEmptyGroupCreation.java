package addressbook.tests;

import org.testng.annotations.Test;

public class NonEmptyGroupCreation extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroups();
    app.getGroupHelper().groupCreation();
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header name 1";
    group.footer = "footer variable 1";
	app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitButton();
    app.getGroupHelper().returnToGroupPage();
  }
}
