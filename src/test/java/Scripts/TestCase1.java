package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import generic_library.BaseClass;

public class TestCase1 extends BaseClass {
@Test
public void tc1() throws Throwable
{
	SkillraryHomePage s=new SkillraryHomePage(driver);
	s.gearsButton();
	s.skillraryDemoApp();
	utilities.childBrowser(driver);
	DemoSkillraryPage ds = new DemoSkillraryPage(driver);
	utilities.dropDown(ds.getSelectDd(),pdata.getProperydata("coursedd"));
	TestingPage t= new TestingPage(driver);
	utilities.Scrolling(driver,t.getFacebook());
	Thread.sleep(3000);
	t.FacebookWebElement();
	
}
}
