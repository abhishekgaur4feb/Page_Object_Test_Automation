package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page_object extends BaseClass{

	public static WebDriver driver;



	public Login_page_object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")
	public static WebElement text_box;

	@FindBy(how=How.XPATH, using="//*[@id='gb']")
	public static WebElement click_outside;

	
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[3]/form/div[2]/div/div[3]/center/input[1]")
	public static WebElement search_button;
	//3rd
	///html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/h3
	@FindBy(how=How.XPATH, using="/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/h3")
	public static WebElement page_hit;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Automation Laboratories: E Learning - Anytime, Anywhere")
	public static WebElement click_website_button;
	

	@FindBy(how=How.XPATH, using="/html/body/div[2]/header/div/div/div/div[2]/nav/div/ul/li[3]/a")
	public static WebElement click_blog_website;
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[2]/div/div/div[1]/main/div/article[1]/header")
	public static WebElement blog_button;
	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Containerization Docker")
	public static WebElement blog_bottom_button;
	
	
	
	
}
