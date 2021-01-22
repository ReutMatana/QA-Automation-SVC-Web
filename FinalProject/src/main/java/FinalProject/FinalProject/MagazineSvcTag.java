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
	//@FindBy (xpath = "//*[@href = 'https://svcollege.co.il/%d7%9e%d7%a9%d7%91%d7%a8-%d7%94%d7%a7%d7%95%d7%a8%d7%95%d7%a0%d7%94-%d7%94%d7%a1%d7%91%d7%94/'][3]") WebElement coronaReadMore;
	//@FindBy (xpath = "//a[@className = 'elementor-post__read-more'][6]") WebElement coronaReadMore;
	
	//@FindBy (xpath  = "//img[contains(@src,'https://svcollege.co.il/wp-content/uploads/2020/08/pexels-anna-shvets-3902732-300x200.jpg 300w, https://svcollege.co.il/wp-content/uploads/2020/08/pexels-anna-shvets-3902732.jpg 640w\r\n')][1]") WebElement coronaReadMore;
	//@FindBy (xpath  = "//img[contains(@src, 'https://svcollege.co.il/wp-content/uploads/2020/08/pexels-anna-shvets-3902732-300x200.jpg')]") WebElement coronaReadMore;
	@FindBy (xpath  = "//img[@href='https://svcollege.co.il/wp-content/uploads/2020/08/pexels-anna-shvets-3902732-300x200.jpg'][1]") WebElement coronaReadMore;

	//https://svcollege.co.il/wp-content/uploads/2020/08/pexels-anna-shvets-3902732-300x200.jpg 300w, https://svcollege.co.il/wp-content/uploads/2020/08/pexels-anna-shvets-3902732.jpg 640w

	//Ctor
	
	public MagazineSvcTag(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	
	
	//FUNC

	public boolean CoronaReadMoreFunc() {
		try {	
		//	System.out.println("coronaReadMore before wait");
			//WebDriverWait wait = new WebDriverWait(driver,40);
		//	wait.until(ExpectedConditions.elementToBeClickable(By.className("elementor-post__thumbnail__link no-lightbox")));
		//	System.out.println("coronaReadMore after wait");
			
			System.out.println("coronaReadMore before click");
			coronaReadMore.click();
			System.out.println("coronaReadMore after click");
			return true;
		} 
		catch (Exception e) {
			System.out.println("Cant click on coronaReadMore");
			e.printStackTrace();
			return false;
		}
		
	}

}
