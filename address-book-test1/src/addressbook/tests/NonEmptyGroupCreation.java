package addressbook.tests;

import org.testng.annotations.Test;

public class NonEmptyGroupCreation extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
	gotoGroups();
    groupCreation();
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header name 1";
    group.footer = "footer variable 1";
	fillGroupForm(group);
    submitButton();
    returnToGroupPage();
  }
}
