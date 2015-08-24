package addressbook.tests;

import org.testng.annotations.Test;

public class EmptyGroupCreation extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
	gotoGroups();
    groupCreation();
	fillGroupForm(new GroupData("","",""));
    submitButton();
    returnToGroupPage();
  }

}
