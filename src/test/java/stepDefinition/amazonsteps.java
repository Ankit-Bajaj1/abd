package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonsteps {
	public WebDriver driver;
	@Given("Launch Amazon website")
	public void launch_Amazon_website() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003DHE744\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
	    
	}

	@When("Verify that signIn button is displayed")
	public void verify_that_signIn_button_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")));
//	    Boolean k=driver.findElement(By.xpath(("//*[text()='Sign In']"))).isDisplayed();
       
	}

	@When("click on Menu Icon")
	public void click_on_Menu_Icon() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	   
	}

	@When("click on Best Sellers")
	public void click_on_Best_Sellers() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")).click();
	   
	}

	@Then("Verify best sellers header")
	public void verify_best_sellers_header() throws InterruptedException {
		
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
		String headervalue=driver.findElement(By.xpath("//span[@id='zg_banner_text']")).getText();
	    Assert.assertEquals(headervalue, "Amazon Bestsellers");
	}



}
