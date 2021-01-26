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
	@FindBy (xpath = "//article[@class = 'elementor-post elementor-grid-item post-7820 post type-post status-publish format-standard has-post-thumbnail hentry category-1 entry has-media']") WebElement coronaTitle;
	@FindBy (xpath = "//div[@class = 'elementor-post__text']") WebElement articleGrid;
	@FindBy (xpath  = "//img[contains(@srcset, 'https://svcollege.co.il/wp-content/uploads/2020/10/nick-morrison-FHnnjk1Yj7Y-unsplash.jpg 640w')]") WebElement onlineCoursesImg;
	@FindBy (xpath  = "//a[@href = 'https://svcollege.co.il/author/angora/']") WebElement moreInfo;

	//Ctor
	public MagazineSvcTag(WebDriver HomePage) {
		this.HomePage = HomePage;
		PageFactory.initElements(HomePage, this);
	}
	public void sleepFUNC(int slp) {
		try {Thread.sleep(slp);} catch (InterruptedException e) {e.printStackTrace();}
	}
	//מאמר- משבר הקורונה
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
}