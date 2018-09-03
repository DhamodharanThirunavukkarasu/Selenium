package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smotetest {
	
WebDriver driver;
	
@Given("^Open Firefox and start application$")
public void Open_Firefox_and_start_application() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "E:\\Software\\selenium\\gecko\\geckodriver.exe");
	
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
    
}

@When("^I enter valid \"(.*)\" and \"(.*)\"$")
public void I_enter_valid_username_and_password(String uname,String pass) throws Throwable {
	
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pass);
    
}

@Then("^user  should be login success$")
public void user_should_be_login_success() throws Throwable {
	
	System.out.println("Credentials entered successfully");
	driver.quit();
    
}



}
