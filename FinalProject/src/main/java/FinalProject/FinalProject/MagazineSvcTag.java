package FinalProject.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagazineSvcTag {

	private WebDriver driver;
	private WebDriver HomePage;  

	//Locators
	@FindBy (xpath = "//article[@class = 'elementor-post elementor-grid-item post-7820 post type-post status-publish format-standard has-post-thumbnail hentry category-1 entry has-media']") WebElement coronaTitle;
	@FindBy (xpath = "//div[@class = 'elementor-post__text']") WebElement articleGrid;
	@FindBy (xpath  = "//img[contains(@srcset, 'https://svcollege.co.il/wp-content/uploads/2020/10/nick-morrison-FHnnjk1Yj7Y-unsplash.jpg 640w')]") WebElement onlineCoursesImg;
	@FindBy (xpath  = "//a[@href = 'https://svcollege.co.il/author/angora/']") WebElement moreInfo;
	@FindBy (xpath  = "//p[contains(., 'פחות או יותר')]") WebElement bAOrPracticalXText;
	@FindBy (xpath  = "//a[@href = 'https://svcollege.co.il/%d7%aa%d7%95%d7%90%d7%a8-%d7%a8%d7%90%d7%a9%d7%95%d7%9f-%d7%90%d7%95-%d7%a0%d7%99%d7%a1%d7%99%d7%95%d7%9f-%d7%9e%d7%a2%d7%a9%d7%99/']") WebElement bAOrPracticalXImg;
	@FindBy (xpath = "//div[@class = 'elementor-author-box__name']") WebElement eranHildesheimText;
	@FindBy (xpath  = "//a[@class = 'elementor-author-box__button elementor-button elementor-size-xs']") WebElement eranHildesheimBtn;
	
	//Ctor
	public MagazineSvcTag(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}
	//מאמרים- משבר הקורונה
	public boolean CoronaFunc() {
		sleepFUNC(1000);
		coronaTitle.click(); 
		sleepFUNC(1000);
		articleGrid.click();
		sleepFUNC(1000);
		onlineCoursesImg.click();
		sleepFUNC(1000);
		moreInfo.click();
		return true;
	}
	//מאמר- תואר ראשון או ניסיון מעשי?
		public boolean BAOrPracticalXFunc() {
		bAOrPracticalXText.click();
		sleepFUNC(2000);
		bAOrPracticalXImg.click();
		sleepFUNC(1500);
		eranHildesheimText.click();
		sleepFUNC(1500);
		eranHildesheimBtn.click();
		return true;
		}
}