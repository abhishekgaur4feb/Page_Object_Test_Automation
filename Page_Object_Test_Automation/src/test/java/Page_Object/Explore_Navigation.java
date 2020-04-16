package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Explore_Navigation extends BaseClass{

	public static WebDriver driver;



	public Explore_Navigation(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="//li[@id='menu-item-652']")
	public static WebElement Explore;

	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")
	public static WebElement text_box;
	
	@FindBy(how=How.XPATH, using="//*[@id='gb']")
	public static WebElement click_outside;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[3]/form/div[2]/div/div[3]/center/input[1]")
	public static WebElement search_button;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Automation Laboratories: E Learning - Anytime, Anywhere")
	public static WebElement click_website_button;
	
	
	@FindBy(how=How.XPATH, using="//body[contains(@class,'siteorigin-panels-home ctct-sydney group-blog customize-support')]/div[@id='page']/header[@id='masthead']/div[@class='header-wrap']/div[@class='container']/div[@class='row']/div[@class='col-md-8 col-sm-4 col-xs-12']/nav[@id='mainnav']/div[@class='menu-home-container']/ul[@id='menu-home']/li[@id='menu-item-652']/ul[@class='sub-menu']/li[@id='menu-item-138']/a[1]")
	public static WebElement Selenium_Webdriver;
	
}

