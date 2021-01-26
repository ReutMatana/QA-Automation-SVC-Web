package FinalProject.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAppDevSelcet {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath = "//section[contains(@data-id, '7b80471')]") WebElement widgetWrap;
	@FindBy (xpath = "//a[@href = '#web-content'][1]") WebElement courseContentBtn;
	@FindBy (xpath = "//h4[@id = 'elementor-tab-title-1943']") WebElement openCSS3Icon;
	@FindBy (xpath = "//h4[@id = 'elementor-tab-title-1943']") WebElement closeCSS3Icon;

	//Ctor
	public WebAppDevSelcet(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}

	//Course Web And App Development
	public boolean CourseContent() {
		widgetWrap.click();
		sleepFUNC(1500);
		courseContentBtn.click();
		sleepFUNC(2000);
		openCSS3Icon.click();
		closeCSS3Icon.click();
		return true;
	}
}