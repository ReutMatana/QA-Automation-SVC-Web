package FinalProject.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingSelect {

	private WebDriver driver;
	private WebDriver HomePage;  
	
	//Locators
	@FindBy (xpath  = "//a[contains(.,'קורס QA')]") WebElement courseQa;
	@FindBy (xpath = "//a[@href = '#happen-after-course']") WebElement endCourseBtn;
	
	
	//Ctor
	public TestingSelect(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}

	//FUNC
	public boolean CourseQaFunc() {
		try {	
			System.out.println("CourseQa before click");
			courseQa.click();
			System.out.println("CourseQa after click");
			return true;
		} 
		catch (Exception e) {
			System.out.println("Cant click on CourseQa");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean EndCourseFunc() {
		try {	
			System.out.println("endCourseBtn before click");
			endCourseBtn.click();
			System.out.println("endCourseBtn after click");
			return true;
		} 
		catch (Exception e) {
			System.out.println("Cant click on endCourseBtn");
			e.printStackTrace();
			return false;
		}
	}
}
	