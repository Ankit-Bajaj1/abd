package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googlesteps {
	
	public WebDriver driver;
	@Given("To launch Google url")
	public void to_launch_Google_url() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003DHE744\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	    
	}

	@When("search bar visible")
	public void search_bar_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println(driver.findElement(By.name("q")).isDisplayed());
	}

//	@Then("Enter text Ankit")
//	public void enter_text_Ankit() {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//		driver.findElement(By.name("q")).sendKeys("Ankit");
//	}
	
	@Then("Enter text {string}")
	public void enter_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(string);
	}
	
	@And("user closes the browser")
	public void enter_text_Ankit() {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.close();
	}


}
