package FinalProject.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaCourse {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath = "//a[@href = '#happen-after-course']") WebElement endCourseBtn;
	@FindBy (xpath = "//span[contains(., 'היתרונות שלנו')]") WebElement advantage;
	@FindBy (xpath = "//h4[@class = 'elementor-tab-title' and @data-tab = '3']") WebElement openthirdQuestion;

	//Ctor
	public QaCourse(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}
	//Course Completion
	public boolean EndCourseFunc() {
		endCourseBtn.click();
		return true;
	}
	//"Qa Course" Box
	public boolean OurAdvantageFunc() {
		advantage.click();
		sleepFUNC(2000);
		openthirdQuestion.click();
		return true; 
	}
}