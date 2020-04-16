package Step_Defination;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_feature_step {
	static final Logger logger = Logger.getLogger(Login_feature_step.class);
	public WebDriver driver;

	@Given("^Open browser$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		//driver.get("http://www.rarecarat.com");
		}
	
	@When("^NewUser enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String settings_type, String password, String send_text) throws InterruptedException {
		BasicConfigurator.configure();
		//Initialization
		PageFactory.initElements(driver, Login_page_object.class);

		Login_page_object.text_box.sendKeys(send_text);
		
		
		
		Thread.sleep(2000);
		
		Login_page_object.click_outside.click();
		
		Thread.sleep(4000);
		
		Login_page_object.search_button.click();

		
		Thread.sleep(4000);
		
		///JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500)", "");
		
		//Login_page_object.page_hit.click();
		
		//JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500)", "");
		
		//Thread.sleep(2000);
		Login_page_object.click_website_button.click();
		
				
		Thread.sleep(4000);
		
		Login_page_object.click_blog_website.click();
		
		Thread.sleep(5000);
		
		Login_page_object.blog_button.click();
		
		JavascriptExecutor jse11 = (JavascriptExecutor)driver;
		jse11.executeScript("window.scrollBy(0,5000)", "");
		
		Thread.sleep(6000);
		
		Login_page_object.blog_bottom_button.click();
		
		Thread.sleep(6000);
		
		JavascriptExecutor jse12 = (JavascriptExecutor)driver;
		jse11.executeScript("window.scrollBy(0,5000)", "");
		
		Thread.sleep(10000);
		
	}

	@Then("^Message displayed Login Successful$")
	public void message_displayed_Login_Successful() throws Throwable {
		logger.info("login verified Successfully");	    
	}
	


}
