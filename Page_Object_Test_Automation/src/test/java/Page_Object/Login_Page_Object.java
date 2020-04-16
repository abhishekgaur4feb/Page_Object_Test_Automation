package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page_Object extends BaseClass{

	public static WebDriver driver;



	public Login_Page_Object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="//input[@id='username']")
	public static WebElement Username;

	@FindBy(how=How.XPATH, using="//input[@id='password']")
	public static WebElement Password;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn__primary--large from__button--floating']")
	public static WebElement Sign_In;
	
	}

