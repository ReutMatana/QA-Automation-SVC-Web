package FinalProject.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private static WebDriver driver;

	//Locators
	@FindBy (id = "popCloseBox") WebElement popBox;	
	@FindBy (id = "enable-toolbar-trigger") WebElement accessibilityBtn;
	@FindBy (xpath = "//span[@aria-label = 'Go to slide 4']") WebElement slide4;
	@FindBy (xpath = "//span[@aria-label = 'Go to slide 5']") WebElement slide5;
	@FindBy (xpath = "//span[@aria-label = 'Go to slide 6']") WebElement slide6;
	@FindBy (xpath = "//div[@class = 'elementor-form-fields-wrapper elementor-labels-'][1]") WebElement fieldsWrapper;
	@FindBy (xpath = "//input[@placeholder = 'שם']") WebElement nameInput;
	@FindBy (xpath = "//input[@placeholder = 'טלפון']") WebElement phoneInput;
	@FindBy (xpath = "//input[@placeholder = 'מייל']") WebElement mailInput;	
	@FindBy (xpath = "//p[contains(.,'המכללה המובילה')]") WebElement bottomText;
	@FindBy (xpath = "//span[contains(., 'ביקורות SVCOLLEGE')]") WebElement reviews;
	@FindBy (xpath = "//div[@class = 'elementor-element elementor-element-36c576e elementor-position-top elementor-vertical-align-top elementor-widget elementor-widget-image-box']") WebElement qaCourseBox;
	@FindBy (xpath = "//a[contains(.,'בדיקות תוכנה')]") WebElement testingSelect;
	@FindBy (xpath = "//a[contains(.,'קורס QA')]") WebElement courseQa;
	@FindBy (xpath = "//a[contains(.,'קורס אוטומציה')]") WebElement courseAuto;
	@FindBy (xpath = "//a[contains(.,'פיתוח')]") WebElement developmentFunc;
	@FindBy (xpath = "//a[contains(.,'קורס בניית אתרים ואפליקציות (Full Stack)')]") WebElement wedAndAppBtn;
	@FindBy (xpath = "//li[@class = 'menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-5914'][1]") WebElement aboutTagSelect;
	@FindBy (xpath = "//a[@href = 'https://svcollege.co.il/%d7%9b%d7%aa%d7%91%d7%95-%d7%a2%d7%9c%d7%99%d7%a0%d7%95/']") WebElement aboutUs;
	@FindBy (xpath = "//a[contains(.,'הסבה להייטק')]") WebElement conversionHTTag;
	@FindBy (xpath = "//a[@href = 'https://svcollege.co.il/%d7%91%d7%9c%d7%95%d7%92-2/'][1]") WebElement magazineBtn;
	@FindBy (xpath = "//a[contains(.,'צרו קשר')]") WebElement contact;
	@FindBy (xpath = "//a[@href = 'tel:03-6343434']") WebElement mailContactIcon;

	//Ctor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}
	public boolean ClosePopFunc() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("popCloseBox")));
		sleepFUNC(1500);
		popBox.click();
		sleepFUNC(2000);
		return true;
	}
	//"Accessibility" Button
	public boolean AccessibilityFunc() {
		accessibilityBtn.click();
		sleepFUNC(5000);
		return true; 
	}
	//"Qa Course" Box
	public boolean QaCourseBoxFunc() {
		qaCourseBox.click();
		sleepFUNC(3000);
		return true; 
	}
	//Success Stories Of College Graduates
	public boolean StoriesofGraduates() {
		slide4.click();
		sleepFUNC(2000);
		System.out.println("after4");
		slide5.click();
		sleepFUNC(2000);
		System.out.println("after5");
		slide6.click();
		sleepFUNC(2000);
		System.out.println("after6");
		return true; 
	}
	//Counseling Call (Bottom Main Page)
	public boolean FillFieldsFunc(String name, String phone, String mail) {
		fieldsWrapper.click();
		nameInput.sendKeys(name);
		phoneInput.sendKeys(phone);
		mailInput.sendKeys(mail);
		return true; 
	}   
	//Reviews (Bottom Main Page)
	public boolean ReviewsBottomFunc() {
		bottomText.click();
		sleepFUNC(3000);
		reviews.click();
		return true;
	}
	//"Software testing" Tag
	public boolean TestingSelectFunc() {
		testingSelect.click();
		sleepFUNC(3000);
		return true; 
	}
	//Qa Course In Select
	public boolean CourseQaFunc() {
		courseQa.click();
		return true;
	} 
	//Automation course In Select
	public boolean CourseAutoFunc() {
		courseAuto.click();
		return true;
	}
	//"Development" - Content Of Course Web And App
	public boolean DevSelect() {
		developmentFunc.click();
		sleepFUNC(3000);
		wedAndAppBtn.click();
		sleepFUNC(3000);
		return true; 
	}
	//"About Tag"-"Wrote About Us" In Mako
	public boolean AboutFunc() {
		aboutTagSelect.click();
		sleepFUNC(3000);
		aboutUs.click();	
		return true;
	}
	//"Conversion To High-Tech" Tag
	public boolean ConversionHighTFunc() {
		conversionHTTag.click();
		return true; 
	}
	//"Magazine SVCollege" Tag
	public boolean MagazineSvcFunc() {
		magazineBtn.click();
		return true; 
	}
	//Mail In "Contact Us" Tag
	public boolean ClickContactFunc() {
		contact.click();
		sleepFUNC(2000);
		mailContactIcon.click();
		return true;
	}
}