package Step_Defination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	public static WebDriver driver;
	public Properties prop;
	//Changes in hooks

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid
	 * shared state between tests
	 */
	public void openBrowser() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("src//main//resources//Browser.properties");
		prop.load(fis);
		String url=prop.getProperty("url");
		String Browsername=prop.getProperty("browser");
		
		if(Browsername.equals("chrome")){
			System.out.println("Called openBrowser");
			System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
					
			//Make Load of Browser Faster//
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			capabilities.setCapability("pageLoadStrategy", "none");
			//Make Load of Browser Faster//
			driver = new ChromeDriver(capabilities);
			
			driver.manage().deleteAllCookies();
			driver.get(url);
			driver.manage().window().maximize();
		}
		else if(Browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.get(url);
			driver.manage().window().maximize();
			}
	}


	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) throws IOException {

		if(scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
				//byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				//scenario.embed(screenshot, "image/png");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("Screenshots//"+scenario.getName()+"screenshot.png"));
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		}
		driver.close();
		driver.quit();

	}

}