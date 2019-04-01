package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GUIStepDefination {

	
public	WebDriver driver;
	@Given("^user launches browser and navigates to www\\.facebook\\.com$")

		public void user_launches_browser_and_navigates_to_www_gmail_com() throws Throwable {
			System.setProperty("webdriver.Chrome.driver", "C:\\New folder\\googlesigin\\chromedriver.exe");
			    driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
Thread.sleep(1000);

		    throw new PendingException();
		}

	@When("^user enter username\"([^\"]*)\"$/")

		public void user_clicks_on_your_gmail_com(String user) throws Throwable {
		WebElement enter =driver.findElement(By.xpath("//input[contains(@data-testid,'email')]"));
		enter.sendKeys(user);
			
			  
		}

				

	}


