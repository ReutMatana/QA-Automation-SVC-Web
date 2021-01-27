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
	@FindBy (xpath = "//input[@aria-label = 'הקלד כאן והקש enter']") WebElement MSGInput;

	//@FindBy (xpath  = "//a[contains(.,'שלח')]") WebElement sendClick;

	@FindBy (id = "enable-toolbar-trigger") WebElement accessibilityBtn;
	@FindBy (xpath = "//a[@href = '#omw-205']") WebElement quick;
	
	@FindBy (xpath = "//input[@placeholder = 'שם ומשפחה']") WebElement fullNameInput;
	//@FindBy (xpath = "//input[@placeholder = 'דוא\"ל']") WebElement mailInputWin;
	//@FindBy (xpath = "//input[@name ='form_fields[email]']") WebElement mailInputWin;
	//@FindBy (xpath = "//a[@class = 'omw-close-modal']") WebElement closeWin;

	@FindBy (xpath = "//div[@class = 'elementor-form-fields-wrapper elementor-labels-'][1]") WebElement fieldsWrapper;
	@FindBy (xpath = "//input[@placeholder = 'שם']") WebElement nameInput;
	//@FindBy (xpath = "//input[@placeholder = 'טלפון']") WebElement phoneInput;
	@FindBy (xpath = "//input[@placeholder = 'מייל']") WebElement mailInput;	
	@FindBy (xpath = "//p[contains(.,'המכללה המובילה')]") WebElement bottomText;
	@FindBy (xpath  = "//span[contains(., 'ביקורות SVCOLLEGE')]") WebElement reviews;
	@FindBy (xpath  = "//a[contains(.,'בדיקות תוכנה')]") WebElement testingSelect;
	@FindBy (xpath  = "//a[contains(.,'קורס QA')]") WebElement courseQa;
	@FindBy (xpath  = "//a[contains(.,'קורס אוטומציה')]") WebElement courseAuto;
	@FindBy (xpath  = "//a[contains(.,'פיתוח')]") WebElement developmentFunc;
	@FindBy (xpath  = "//a[contains(.,'קורס בניית אתרים ואפליקציות (Full Stack)')]") WebElement wedAndAppBtn;
	@FindBy (xpath  = "//li[@class = 'menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-5914'][1]") WebElement aboutTagSelect;
	@FindBy (xpath = "//a[@href = 'https://svcollege.co.il/%d7%9b%d7%aa%d7%91%d7%95-%d7%a2%d7%9c%d7%99%d7%a0%d7%95/']") WebElement aboutUs;
	@FindBy (xpath  = "//a[contains(.,'הסבה להייטק')]") WebElement conversionHTTag;
	@FindBy (xpath = "//a[@href = 'https://svcollege.co.il/%d7%91%d7%9c%d7%95%d7%92-2/'][1]") WebElement magazineBtn;
	@FindBy (xpath  = "//a[contains(.,'צרו קשר')]") WebElement contact;
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
	public boolean WaitPop() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("popCloseBox")));
		return true;
	}
	//שליחת הודעה בצא'ט
	public boolean WriteMSGPopFunc(String textTmp) {
		System.out.println("before WriteMSGPopFunc");
		MSGInput.sendKeys(textTmp);
		sleepFUNC(10000);
		System.out.println("after WriteMSGPopFunc");
		//sendClick.click();		
		//System.out.println("Contact after SendClickFunc"); 
		return true;
	}
	//"כפתור "נגישות
	public boolean AccessibilityFunc() {
		accessibilityBtn.click();
		sleepFUNC(5000);
		return true; 
	}
	//"כפתור "יצירת קשר מהירה
	public boolean QuickContactFunc() {
		quick.click();
		sleepFUNC(2000);
		return true; 
	}
	//יצירת קשר מהירה- חלון השארת פרטים
	public boolean FillFieldsWin(String fullName, String mail, String phone) {
		System.out.println("before full name");
		fullNameInput.sendKeys(fullName);
		
		System.out.println("before mail");
		//mailInputWin.sendKeys(mail);
		
		System.out.println("before phone");
		//phoneInput.sendKeys(phone);
		sleepFUNC(2000);
		//closeWin.click();
		return true; 
	}
	//שיחת יעוץ (בתחתית העמוד הראשי)
	public boolean FillFieldsFunc(String name, String phone, String mail) {
		fieldsWrapper.click();
		nameInput.sendKeys(name);
		//phoneInput.sendKeys(phone);
		mailInput.sendKeys(mail);
		return true; 
	}   
	//ביקורות  (בתחתית העמוד הראשי)
	public boolean ReviewsBottomFunc() {
		bottomText.click();
		sleepFUNC(3000);
		reviews.click();
		return true;
	}
	//"לשונית "בדיקות תוכנה
	public boolean TestingSelectFunc() {
		testingSelect.click();
		sleepFUNC(3000);
		return true; 
	}
	//קורס QA
	public boolean CourseQaFunc() {
		courseQa.click();
		return true;
	} 

	//קורס AUTO
	public boolean CourseAutoFunc() {
		courseAuto.click();
		return true;
	}
	//לשונית פיתוח אתרים ואפליקציות
	public boolean DevSelect() {
		developmentFunc.click();
		sleepFUNC(3000);
		wedAndAppBtn.click();
		sleepFUNC(3000);
		return true; 
	}

	//לשונית אודות-כתבו עלינו
	public boolean AboutFunc() {
		System.out.println("before btn 1");
		aboutTagSelect.click();
		sleepFUNC(3000);
		System.out.println("before btn 2");
		aboutUs.click();	
		return true;
	}

	//"לשונית "הסבה להייטק
	public boolean ConversionHighTFunc() {
		conversionHTTag.click();
		return true; 
	}
	//"svc לשונית "מגזין
	public boolean MagazineSvcFunc() {
		magazineBtn.click();
		return true; 
	}
	//"לחיצה על לשונית "צור קשר
	public boolean ClickContactFunc() {
		contact.click();
		sleepFUNC(2000);
		mailContactIcon.click();
		return true;
	}
}