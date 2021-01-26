package FinalProject.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCourseSelect {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath = "//h2[contains(., 'קורס אוטומציה אונליין')][1]") WebElement autoOnlineTitle;
	@FindBy (xpath = "//span[@class = 'elementor-button-text']") WebElement autoOnlineBtn;
	@FindBy (xpath  = "//div[@class = 'elementor-button-wrapper']") WebElement registrationBtn;
	@FindBy (xpath = "//section[@data-id = '579ad64a']") WebElement fullSyllabus;
	@FindBy (xpath = "//div[@id = 'elementor-tab-title-1502']") WebElement openSeleniumIcon;
	@FindBy (xpath = "//div[@id = 'elementor-tab-title-1502']") WebElement closeSeleniumIcon;
	@FindBy (xpath = "//a[@href = 'https://svcollege.co.il/wp-content/uploads/2020/12/סיליבוס-מכללת-SVcollege-.pdf']") WebElement downloadSyllabus;
	@FindBy (xpath  = "//div[@data-id = '14f203a6']") WebElement detailsTitle;
	@FindBy (xpath  = "//a[contains(., 'תחזרו אליי עם פרטים')]") WebElement detailsBtn;

	//Ctor
	public AutoCourseSelect(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}

	public boolean OnlineAutoFunc() {
		autoOnlineTitle.click();
		sleepFUNC(3000);
		autoOnlineBtn.click();
		registrationBtn.click();
		return true;
	}
	//Automation Course Syllabus
	public boolean AutoSyllFunc() {
		fullSyllabus.click();
		sleepFUNC(3000);
		openSeleniumIcon.click();
		sleepFUNC(3000);
		closeSeleniumIcon.click();
		sleepFUNC(3000);
		downloadSyllabus.click();
		return true;
	}
	//Automation Course Details
	public boolean AutoDetailsFunc() {
		detailsTitle.click();
		sleepFUNC(3000);
		detailsBtn.click();
		sleepFUNC(3000);
		return true;
	}
	
}