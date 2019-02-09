package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.When;

public class JumpsuitwithTieBelt {
	@FindBy(xpath="//*[@id=\"picker-1\"]/button")WebElement firstitem;
	@FindBy(xpath="//*[@id=\\\"picker-1\\\"]/button/span")WebElement cart; 
	
	WebDriver dr;
	JumpsuitwithTieBelt(WebDriver dr){
		PageFactory.initElements(dr, this);
		this.dr=dr;
	}




	@When("^i click on first item$")
	public void i_click_on_first_item() throws Throwable {
		
		Select s= new Select((WebElement) (By.xpath("first item")));
		s.selectByValue("0");
	}
	
	
	@When("^i add to cart$")
	public void i_add_to_cart() throws Throwable {
		dr.findElement(By.xpath("cart")).click();

	}
}
