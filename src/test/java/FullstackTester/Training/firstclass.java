package FullstackTester.Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003DHE744\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ankit");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bajaj");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ankit.bajaj@ibm.com");
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8888899999");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Physics");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("House No. 260 Sector 12 Part 2 Karnal Haryana , 132001");
		
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	
	Select s= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
	s.selectByValue("5");
	
	Select s1= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
	s1.selectByValue("1991");
	
	driver.findElement(By.xpath("//*[text()='22']")).click();
	
	driver.findElement(By.cssSelector("#submit")).click();
	
	driver.close();
	
	
		
	}
	

}
