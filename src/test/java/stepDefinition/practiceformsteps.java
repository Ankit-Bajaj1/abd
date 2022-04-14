package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class practiceformsteps {
	
	public WebDriver driver;

	@Given("user navigates to Automation practice form")
	public void user_navigates_to_Automation_practice_form() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003DHE744\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}

	@When("I enter first name {string}")
	public void i_enter_first_name(String FirstName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(FirstName);
		
	}

	@When("I enter last name {string}")
	public void i_enter_last_name(String LastName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(LastName);
		
	}

	@When("I enter Email {string}")
	public void i_enter_Email(String Email) {
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(Email);
		
	}

	@When("I enter Phone Number {string}")
	public void i_enter_Phone_Number(String PhoneNumber) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(PhoneNumber);
	}

	@When("I enter Address {string}")
	public void i_enter_Address(String Address) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Address);
	}
	
	@When("I enter {string},{string},{string}")
	public void i_enter(String Date, String Month, String Year) {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		s.selectByValue(Month);
		
		Select s1= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		s1.selectByValue(Year);
		
		driver.findElement(By.xpath("//*[text()='"+Date+"']")).click();
	}

	@Then("I click on Submit button")
	public void i_click_on_Submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}
	
	@Then("Fillup the form for Automation")
	public void fillup_the_form_for_Automation(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
//		
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(data.get(0).get("FirstName"));
    	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(data.get(0).get("LastName"));
    	driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(data.get(0).get("PhoneNumber"));
	}


	
	@Then("Fillup the form")
	public void fillup_the_form(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<List<String>> rows = dataTable.asLists(String.class);
	    
	    for (List<String> columns : rows) {
//	        store.addBook(new Book(columns.get(0), columns.get(1)));
	    	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(columns.get(0));
	    	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(columns.get(1));
	    	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(columns.get(2));
			driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(columns.get(3));
	      
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			
			//driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Physics");
			driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(columns.get(7));
	        
			driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
			
			Select s= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			s.selectByValue(columns.get(5));
			
			Select s1= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			s1.selectByValue(columns.get(6));
			
			driver.findElement(By.xpath("//*[text()='"+columns.get(4)+"']")).click();
			
			driver.close();
	    }
	    
	}




}
