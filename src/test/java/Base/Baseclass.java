package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Baseclass {
	WebDriver dr;
	@FindBy(xpath="/html/body/header/div[2]/div[2]/nav/ul/li[1]/a") WebElement item;
	@FindBy(xpath="/html/body/header/div[2]/div[2]/nav/ul/li[1]/a")WebElement women;
	@Given("^i am going to open a browser$")
	public void i_am_going_to_open_a_browser() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "/Users/hasanath/Desktop/chromedriver");
		dr= new ChromeDriver();
		
	}

	@Given("^i will nevigate  to h&h$")
	public void i_will_nevigate_to_h_h() throws Throwable {
		dr.get("https://www2.hm.com/en_us/index.html");
	
	}


	@When("^i hoverover on women section$")
	public void i_hoverover_on_women_section() throws Throwable {
		dr.findElement(By.xpath("women")).click();
		PageFactory.initElements(dr, this);
	}	 

	@When("^i click on jumsuit item$")
	public jumsuit i_click_on_jumsuit_item() throws Throwable {
		
		  Actions a= new Actions(dr);
		   a.moveToElement((WebElement) By.xpath("item")).perform();
		   PageFactory.initElements(dr, this);
		   return new jumsuit (dr);
		   
		   }
	




	

	


}
