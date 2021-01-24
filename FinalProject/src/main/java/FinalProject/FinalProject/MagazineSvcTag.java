package FinalProject.FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagazineSvcTag {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath  = "//img[contains(@src, 'https://svcollege.co.il/wp-content/uploads/2020/08/pexels-anna-shvets-3902732-300x200.jpg')]") WebElement coronaReadMore;

	//Ctor
	public MagazineSvcTag(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	/*
	//מאמר- משבר הקורונה
	public boolean CoronaReadMoreFunc() {
		//לגלגל למטה
		coronaReadMore.click();
		return true;
		}
*/
}