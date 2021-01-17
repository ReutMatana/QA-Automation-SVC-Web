package FinalProject.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;

public class HomePage {

	private static WebDriver driver;

	//Locators
	@FindBy (id = "popCloseBox") WebElement popBox;
	@FindBy (xpath  = "//a[contains(.,'צרו קשר')]") WebElement contact;
	//@FindBy (xpath = "by.xpath(//li[@linkText='צרו קשר'])[1]") WebElement contact;
	//@FindBy (id = "sm-16105672433666587-1") WebElement testingTag;
	//@FindBy (xpath = "//span[@class='sub-arrow'][1]") WebElement subArrow;

	//Ctor
	//כדי להשתמש בלוקייטור שיצרנו בפיינד ביי יש לייחס אותם למחלקה הרלוונטית
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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
	
	
	//Function testingTag
	//public void softwareTesting() {
	//	driver.findElement(By.id("sm-16105672433666587-1")).sendKeys("בדיקות תוכנה");	
	//}


	// כאן -מחלקת עמוד הבית כאן נמצאים כל הלוקייטורים ומתבצעות כל הפעולות
	// כפתור QA וזיבל


}
