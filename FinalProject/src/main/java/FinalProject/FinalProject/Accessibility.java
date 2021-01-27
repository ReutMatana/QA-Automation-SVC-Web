package FinalProject.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accessibility {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (id = "enable-lang-en") WebElement usaLng;
	@FindBy (xpath = "//button[@title = 'Using a large black Cursor'][1]") WebElement blackCursorBtn;
	@FindBy (xpath = "//button[@class = 'enable-bottomlinks-reset-accessibility']") WebElement resetBtn;	

	//Ctor
	public Accessibility(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}
	public boolean USALanguage() {
		usaLng.click();
		blackCursorBtn.click();
		sleepFUNC(1500);
		resetBtn.click();
		return true;
	}
}