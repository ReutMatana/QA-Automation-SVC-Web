package FinalProject.FinalProject;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

	private WebDriver driver;
	private HomePage hp;
	private TestingSelect ts;
	private MagazineSvcTag msvc;

	@BeforeMethod
	public void beforeEachTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://svcollege.co.il/");
		hp = new HomePage(driver);
		ts = new TestingSelect(driver); 
	}


	@AfterMethod
	public void afterEachTest() {
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		driver.quit();
		System.out.println("**************END TEST**************");
	}

	@Test
	public void ContactUs() {
		hp.ClosePopFunc();
		hp.ClickContactFunc();
		//לפתוח מחלקת צור קשר+ לבדוק שיש התאמה עם המספר טלפון של המכללה
	}
	@Test
	public void SendMSGPop() {
		hp.WaitPop();
		hp.WriteMSGPopFunc("בדיקה");
		//hp.SendClickFunc();
	}
	@Test 
	public void TestingTag() {
		hp.ClosePopFunc();
		hp.TestingSelectFunc();
		ts.CourseQaFunc();
		ts.EndCourseFunc();
	}
	@Test 
	public void AccessibilityBtn() {
		hp.ClosePopFunc();
		hp.AccessibilityFunc();
		//hp.LanguageFunc();
        //ללחוץ על אלמנט + reset כפתור
	}
	@Test 
	public void MagazineSvcBtn() {
		hp.ClosePopFunc();
		hp.MagazineSvcFunc();
		msvc.CoronaReadMoreFunc();
		//msvc.LanguageFunc();

}
}