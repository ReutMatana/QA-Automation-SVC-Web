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
			courseQa.click();
			return true;
		} 
	public boolean EndCourseFunc() {
			endCourseBtn.click();
			return true;
}
}