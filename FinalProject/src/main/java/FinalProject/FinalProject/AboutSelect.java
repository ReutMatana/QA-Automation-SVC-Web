package FinalProject.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutSelect {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath = "//div[contains(., 'תודה, אתם האלופים שנתתם לי את ההזדמנות, הדחיפה והתמיכה!')]") WebElement ayeletTitle;
	@FindBy (xpath = "//div[@style = 'background-image: url(\"https://svcollege.co.il/wp-content/uploads/2019/04/איילת-אורלוב.jpg\");']") WebElement ayeletagraduates;
	@FindBy (xpath = "//div[@aria-label = 'סגור (Esc)']") WebElement closeImgAyelet;
	@FindBy (xpath = "//a[@href = 'https://www.mako.co.il/study-career-career/articles/Article-da19f1e95fe2071026.htm?sCh=3d385dd2dd5d4110&pId=1886690599']") WebElement articleMakoBtn;

	//Ctor
	public AboutSelect(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}
	//Reviews (at the bottom page)
	public boolean AyeletReviewFunc() {
		ayeletTitle.click();		
		sleepFUNC(3000);
		ayeletagraduates.click();
		sleepFUNC(3000);
		closeImgAyelet.click();
		return true;
	}
	//"About Tag"-"Wrote About Us" In Mako
	public boolean ArticleMako() {
		sleepFUNC(2000);
		articleMakoBtn.click();
		return true;
	}
}