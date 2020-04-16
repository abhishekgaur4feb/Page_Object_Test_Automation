package Step_Defination;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Explore_Navigation;
import Page_Object.Login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Explore_Navigation_Step {
	static final Logger logger = Logger.getLogger(Explore_Navigation_Step.class);
	public WebDriver driver;

	@Given("^Open browser for Explore Navigation Menu$")
	public void open_browser_for_Explore_Navigation_Menu() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
	    
	}

	@When("^NewUser clicks on Explore and pass \"(.*?)\" and \"(.*?)\"$")
	public void newuser_clicks_on_Explore_and_pass(String send_text,String menuoption) throws Throwable {
		
		BasicConfigurator.configure();
		//Initialization
		PageFactory.initElements(driver, Explore_Navigation.class);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		WebElement element2 = wait2
		.until(ExpectedConditions.visibilityOf(Explore_Navigation.text_box));
		Thread.sleep(2000);
		element2.sendKeys(send_text);
		
		Thread.sleep(2000);
		
		Explore_Navigation.click_outside.click();
		
		Thread.sleep(4000);
		
		Explore_Navigation.search_button.click();

		
		Thread.sleep(4000);
		
		///JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500)", "");
		
		//Login_page_object.page_hit.click();
		
		//JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500)", "");
		
		//Thread.sleep(2000);
		Explore_Navigation.click_website_button.click();
		
		Thread.sleep(4000);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement element1 = wait1
		.until(ExpectedConditions.visibilityOf(Explore_Navigation.Explore));
		Thread.sleep(2000);
		element1.click();
		//Center Selection
		
		Actions action = new Actions(driver);
		 
        action.moveToElement(Explore_Navigation.Selenium_Webdriver).build().perform();
	
		  Thread.sleep(4000);
		   logger.info(menuoption+" "+"is the Center Selected by the User");
	    
	}

	@Then("^Message displayed Explore Navigation Menu Successful clicked$")
	public void message_displayed_Explore_Navigation_Menu_Successful_clicked() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
