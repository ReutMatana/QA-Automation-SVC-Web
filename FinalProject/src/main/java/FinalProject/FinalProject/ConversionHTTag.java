package FinalProject.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConversionHTTag {


	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath = "//div[@class = 'elementor-toc__body']") WebElement tableOfContents;
	@FindBy (xpath  = "//a[@href ='#elementor-toc__heading-anchor-0'][1]") WebElement qNum1;	
	@FindBy (xpath  = "//img[@class ='attachment-full size-full lazyloaded']") WebElement svcLogo;

	//Ctor
	public ConversionHTTag(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}
	//"תוכן עניינים בעמוד "הסבה להייטק
	public boolean TableOfContentsBody() {
		tableOfContents.click(); 
		sleepFUNC(3000);
		qNum1.click();
		sleepFUNC(2000);
		svcLogo.click();
		return true;
	}
	//"פרטים בעמוד "הסבה להייטק
	//	public boolean () {
	//		.click(); 
	//		sleepFUNC(3000);
	//		return true;
//}אפשרי לבנות טסט
}