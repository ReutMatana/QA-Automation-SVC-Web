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
	@FindBy (xpath  = "//*[@id='asb']") WebElement MSGInput;
	//@FindBy (xpath  = "//input[contains(.,'כתוב כאן ...')]") WebElement MSGInput;	
	//@FindBy (xpath  = "//input[contains(@id ='asb')][2]") WebElement MSGInput;	
	//@FindBy (xpath = "//label[starts-with(@id, 'asb')][2]") WebElement MSGInput;	
	//@FindBy (xpath = "//td[text()='כתוב כאן ...']") WebElement MSGInput;
	//@FindBy (xpath = "//input[@title='type here and press enter']") WebElement MSGInput;	
	//@FindBy (xpath = ".//input[ancestor::td[preceding-sibling::th/label[text() = 'הקלד כאן והקש enter']]]") WebElement MSGInput;
	//@FindBy (xpath = "//input[@id='asb']//input[@type='text']") WebElement MSGInput;	
	//@FindBy (xpath = "(.//label[text() = 'הקלד כאן והקש enter']/following::input") WebElement MSGInput;	
	//@FindBy (id = "asb") WebElement MSGInput;	

	//@FindBy (xpath  = "//a[contains(.,'שלח')]") WebElement sendClick;

	@FindBy (xpath  = "//a[contains(.,'בדיקות תוכנה')]") WebElement testingSelect;
	@FindBy (xpath = "//circle[@id = 'enable-trigger-circle']/following::input") WebElement accessibility;
	//@FindBy (xpath  = "//div[@id = 'enable-lang-en'][2]") WebElement usaLng;	
	@FindBy (xpath = "//a[@href = 'https://svcollege.co.il/%d7%91%d7%9c%d7%95%d7%92-2/'][1]") WebElement magazineBtn;
	@FindBy (xpath  = "//input[contains(.,'form-field-name')][2]") WebElement fieldName;

	//Ctor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//FUNC
	public boolean ClosePopFunc() {
		try {	
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("popCloseBox")));
			popBox.click();
			return true;
		} 
		catch (Exception e) {
			System.out.println("PopBox didnt POP");
			e.printStackTrace();
			return false;
		}
	}

	public boolean ClickContactFunc() {
		try {	
			System.out.println("Contact before click");
			contact.click();
			System.out.println("Contact after click");
			return true;
		}
		catch (Exception e) {
			System.out.println("Can't Click on Contact");
			e.printStackTrace();
			return false;
		}
	}

	public boolean WaitPop() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("popCloseBox")));
		return true;
	}

	public boolean WriteMSGPopFunc(String textTmp) {
		try {	
			System.out.println("Contact before WriteMSGPopFunc");
			MSGInput.sendKeys(textTmp);
			try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("Contact after WriteMSGPopFunc");
			return true;
		}
		catch (Exception e) {
			System.out.println("Can't Click on WriteMSGPopFunc");
			e.printStackTrace();
			return false;
		}
	}

	/*
	public boolean SendClickFunc() {

		try {
			System.out.println("Contact before SendClickFunc"); 
			sendClick.click();
			System.out.println("Contact after SendClickFunc"); 
			return true; 
			} 
		catch (Exception e) {
			System.out.println("Can't Click on SendClickFunc");
			e.printStackTrace(); 
			return false; 
		} 
	}
	 */

	public boolean TestingSelectFunc() {
		try {
			System.out.println("before TestingSelectFunc"); 
			testingSelect.click();
			System.out.println("after TestingSelectFunc"); 
			return true; 
		} 
		catch (Exception e) {
			System.out.println("Can't Click on TestingSelectFunc");
			e.printStackTrace(); 
			return false; 
		} 
	}

	public boolean AccessibilityFunc() {
		try {
			System.out.println("before AccessibilityBtn"); 
			accessibility.click();
			System.out.println("after AccessibilityBtn"); 
			return true; 
		} 
		catch (Exception e) {
			System.out.println("Can't Click on AccessibilityBtn");
			e.printStackTrace(); 
			return false;
		}
	}
	/*
		public boolean LanguageFunc() {
			try {
				System.out.println("before LanguageFunc"); 
				usaLng.click();
				System.out.println("after LanguageFunc"); 
				return true; 
			} 
			catch (Exception e) {
				System.out.println("Can't Click on LanguageFunc");
				e.printStackTrace(); 
				return false;
			}
	}
	 */

	public boolean MagazineSvcFunc() {
		try {
			System.out.println("before MagazineSVCFunc"); 
			magazineBtn.click();
			System.out.println("after MagazineSVCFunc"); 
			return true; 
		} 
		catch (Exception e) {
			System.out.println("Can't Click on MagazineSVCFunc");
			e.printStackTrace(); 
			return false;
		}
	}

	public boolean WaitFieldName() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("form-field-name")));
	}
	public boolean FieldNameFunc() {
		try {
			System.out.println("before FieldNameFunc"); 
			fieldName.click();
			System.out.println("after FieldNameFunc"); 
			return true; 

		}
		catch (Exception e) {
			System.out.println("FieldNameFunc doesn't respond");
			e.printStackTrace(); 
			return false;
		}
	}
}   