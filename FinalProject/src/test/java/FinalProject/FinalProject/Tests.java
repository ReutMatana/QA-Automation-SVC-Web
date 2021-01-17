package FinalProject.FinalProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    
	private WebDriver driver;
	private HomePage hp;
	//private TestingTag st;

	@BeforeMethod
	public void beforeEachTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://svcollege.co.il/");
		hp = new HomePage(driver);
	}
	
	
	@AfterMethod
	public void afterEachTest() {
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		driver.quit();
		System.out.println("**************END TEST**************");
	}
	
	
	@Test
	public void ClosePop() {
		hp.ClosePopFunc();
		hp.ClickContactFunc();
	}
	
	//@Test
		//public void testingTag() {
		//	st.qaTesting();
		//}
    
}
