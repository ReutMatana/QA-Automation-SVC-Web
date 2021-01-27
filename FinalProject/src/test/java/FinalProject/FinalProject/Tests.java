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
	private Accessibility acc;
	private QaCourseSelect ts;
	private AutoCourseSelect acs;
	private WebAppDevSelcet wad;
	private ConversionHTTag cht;
	private AboutSelect as;
	private MagazineSvcTag msvc;
	


	@BeforeMethod
	public void beforeEachTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://svcollege.co.il/");
		hp = new HomePage(driver);
		acc = new Accessibility(driver);
		ts = new QaCourseSelect(driver); 
		acs = new AutoCourseSelect(driver);
		wad = new WebAppDevSelcet(driver);
		cht = new ConversionHTTag(driver);
		as = new AboutSelect(driver);
		msvc = new MagazineSvcTag(driver);
	}

	@AfterMethod
	public void afterEachTest() {
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		driver.quit();
		System.out.println("**************END TEST**************");
	}

	@Test
	public void SendMSGPop() {
		hp.WaitPop();
		hp.WriteMSGPopFunc("בדיקה");
		//hp.SendClickFunc();
	}

	@Test 
	public void AccessibilityBtn() {
		hp.ClosePopFunc();
		hp.AccessibilityFunc();
		acc.USALanguage();
	}

	@Test 
	public void QuickContactBtn() {
		hp.ClosePopFunc();
		hp.QuickContactFunc();
		hp.FillFieldsWin("בדיקה בדיקה","check2@","11112222");
	}
	
	@Test 
	public void ConsultationCall() {
		hp.ClosePopFunc();
		hp.FillFieldsFunc("בדיקה","1111","check@");
	}

	@Test 
	public void SVCReviews() {
		hp.ClosePopFunc();
		hp.ReviewsBottomFunc();
		as.AyeletReviewFunc();
	} 

	@Test 
	public void CourseQaSelect() {
		hp.ClosePopFunc();
		hp.TestingSelectFunc();
		hp.CourseQaFunc();
		ts.EndCourseFunc();
	}

	@Test 
	public void AutoCourseSelect() {
		hp.ClosePopFunc();
		hp.TestingSelectFunc();
		hp.CourseAutoFunc();
		acs.OnlineAutoFunc();
	}

	@Test 
	public void AutoSyllabus() {
		hp.ClosePopFunc();
		hp.TestingSelectFunc();
		hp.CourseAutoFunc();
		acs.AutoSyllFunc();
	}

	@Test 
	public void Details() {
		hp.ClosePopFunc();
		hp.TestingSelectFunc();
		hp.CourseAutoFunc();
		acs.AutoDetailsFunc();
	}
	
	@Test
	public void WebAppDev() {
	hp.ClosePopFunc();
	hp.DevSelect();
	wad.CourseContent();
	}
	
	@Test 
	public void ConversionHighT() {
		hp.ClosePopFunc();
		hp.ConversionHighTFunc();
		cht.TableOfContentsBody();
	}

	@Test 
	public void WroteAboutUs() {
		hp.ClosePopFunc();
		hp.AboutFunc();
		as.ArticleMako();
	}
	
	@Test 
	public void CoronaArticle() {
		hp.ClosePopFunc();
		hp.MagazineSvcFunc();
		msvc.CoronaFunc();
	}

	@Test 
	public void BAOrPracticalExperienceArticle() {
		hp.ClosePopFunc();
		hp.MagazineSvcFunc();
		msvc.BAOrPracticalXFunc();
	}

	@Test
	public void ContactUs() {
		hp.ClosePopFunc();
		hp.ClickContactFunc();
		// למטה- פרטי הודעה
	}
}