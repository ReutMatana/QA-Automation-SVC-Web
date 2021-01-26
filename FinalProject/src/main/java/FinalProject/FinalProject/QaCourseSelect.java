package FinalProject.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QaCourseSelect {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath = "//a[@href = '#happen-after-course']") WebElement endCourseBtn;
	@FindBy (xpath  = "//a[contains(.,'קורס אוטומציה')]") WebElement courseAuto;
	@FindBy (xpath = "//h2[contains(., 'קורס אוטומציה אונליין')][1]") WebElement autoOnlineTitle;
	@FindBy (xpath = "//span[@class = 'elementor-button-text']") WebElement autoOnlineBtn;
	@FindBy (xpath  = "//div[@class = 'elementor-button-wrapper']") WebElement registrationBtn;

	//Ctor
	public QaCourseSelect(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}

	public boolean EndCourseFunc() {
		endCourseBtn.click();
		return true;
	}

	//קורס AUTO
	public boolean CourseAutoFunc() {
		courseAuto.click();
		autoOnlineTitle.click();
		sleepFUNC(3000);
		autoOnlineBtn.click();
		registrationBtn.click();
		return true;
	}
}