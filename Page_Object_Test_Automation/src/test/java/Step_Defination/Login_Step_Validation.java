package Step_Defination;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Page_Object.Login_Page_Object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.applitools.eyes.*;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

public class Login_Step_Validation {
	static final Logger logger = Logger.getLogger(Login_Step_Validation.class);
	public WebDriver driver;
	public Properties prop;
	EyesRunner runner = new ClassicRunner();
	// Initialize the eyes SDK
	Eyes eyes = new Eyes(runner);
	@Given("^User Open Browser for LinkedIn Login Validation$")
	public void user_Open_Browser_for_LinkedIn_Login_Validation() throws Throwable {
		/*driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		prop=new Properties();
		FileInputStream fis=new FileInputStream("src//main//resources//Browser.properties");
		prop.load(fis);
		String url=prop.getProperty("url");
		// Change the APPLITOOLS_API_KEY API key with yours
		eyes.setApiKey("wdTLJFmx21aatPmvMTx8ChcQcKaFJupM7YTi6EiBtFs110");
	
		// Set AUT's name, test name and viewport size (width X height)
		// We have set it to 800 x 600 to accommodate various screens. Feel free to
		// change it.
		eyes.open(driver, "Demo App", "Smoke Test", new RectangleSize(800, 600));
		driver.manage().window().maximize();
		// Navigate the browser to the "ACME" demo app.
		driver.get(prop.getProperty("url"));
		eyes.checkWindow("Login Window");	*/    
	}

	@When("^User pass Username as \"(.*?)\" and Password as \"(.*?)\"$")
	public void user_pass_Username_as_and_Password_as(String username, String password) throws Throwable {
		
		/*BasicConfigurator.configure();
		//Initialization
		PageFactory.initElements(driver, Login_Page_Object.class);		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
		.until(ExpectedConditions.visibilityOf(Login_Page_Object.Username));
		element2.clear();
		element2.sendKeys(username);		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement element3 = wait3
		.until(ExpectedConditions.visibilityOf(Login_Page_Object.Password));
		element3.clear();
		element3.sendKeys(password);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement element4 = wait4
		.until(ExpectedConditions.visibilityOf(Login_Page_Object.Sign_In));
		element4.click();
		Thread.sleep(2000);
		eyes.checkWindow("Window After Login");		*/
	}

	@Then("^Validation Step is Performed$")
	public void message_displayed_Login_Successfully() throws Throwable {/*
		
		String Current_Url = driver.getCurrentUrl();
		eyes.closeAsync();
		driver.quit();
		eyes.abortIfNotClosed();
	*/}
	

}
