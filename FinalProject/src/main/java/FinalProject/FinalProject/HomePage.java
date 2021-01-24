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
	@FindBy (xpath  = "//a[contains(.,'צרו קשר')]") WebElement contact;
	@FindBy (xpath = "//input[@aria-label = 'הקלד כאן והקש enter']") WebElement MSGInput;
	//@FindBy (xpath  = "//input[@id = 'asb'][2]") WebElement MSGInput;	
	//@FindBy (xpath  = "//input[@value = 'כתוב כאן ...']") WebElement MSGInput;	
	//@FindBy (xpath  = "//input[title = 'type here and press enter']") WebElement MSGInput;	
	//@FindBy (xpath = "//input[text()='כתוב כאן ...']") WebElement MSGInput;

	//@FindBy (xpath  = "//a[contains(.,'שלח')]") WebElement sendClick;

	@FindBy (xpath  = "//a[contains(.,'בדיקות תוכנה')]") WebElement testingSelect;
	@FindBy (id = "enable-toolbar-trigger") WebElement accessibility;
	@FindBy (id = "enable-lang-en") WebElement usaLng;
	@FindBy (xpath = "//button[@title = 'Using a large black Cursor'][1]") WebElement blackCursorBtn;
	@FindBy (xpath = "//button[@class = 'enable-bottomlinks-reset-accessibility']") WebElement resetBtn;
	@FindBy (xpath = "//a[@href = 'https://svcollege.co.il/%d7%91%d7%9c%d7%95%d7%92-2/'][1]") WebElement magazineBtn;
	@FindBy (xpath = "//div[@class = 'elementor-form-fields-wrapper elementor-labels-'][1]") WebElement fieldsWrapper;
	@FindBy (xpath = "//input[@placeholder = 'שם']") WebElement nameInput;
	@FindBy (xpath = "//input[@placeholder = 'טלפון']") WebElement phoneInput;
	@FindBy (xpath = "//input[@placeholder = 'מייל']") WebElement mailInput;	
	
	//Ctor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//"לחיצה על לשונית "צור קשר
	public boolean ClosePopFunc() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("popCloseBox")));
		popBox.click();
		return true;
	}
	public boolean ClickContactFunc() {
		contact.click();
		return true;
	}
	public boolean WaitPop() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("popCloseBox")));
		return true;
	}
	
	public boolean WriteMSGPopFunc(String textTmp) {
			System.out.println("before WriteMSGPopFunc");
			MSGInput.sendKeys(textTmp);
			try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("after WriteMSGPopFunc");
			return true;
	}
	 
	/*
	public boolean SendClickFunc() {
			System.out.println("Contact before SendClickFunc"); 
			sendClick.click();
			System.out.println("Contact after SendClickFunc"); 
			return true; 
	}
	 */
	//"לשונית "בדיקות תוכנה
	public boolean TestingSelectFunc() {
		testingSelect.click();
		return true; 
	}
	//"כפתור "נגישות
	public boolean AccessibilityFunc() {
		accessibility.click();
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
		usaLng.click();
		blackCursorBtn.click();
		resetBtn.click();
		return true; 
	}
	//"svc לשונית "מגזין
	public boolean MagazineSvcFunc() {
		magazineBtn.click();
		return true; 
	}
	//שיחת יעוץ (בתחתית העמוד הראשי)
	public boolean FillFieldsFunc(String name, String phone, String mail) {
		fieldsWrapper.click();
		nameInput.sendKeys(name);
		phoneInput.sendKeys(phone);
		mailInput.sendKeys(mail);
		return true; 
	}   
}