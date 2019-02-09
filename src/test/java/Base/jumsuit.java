package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;

public class jumsuit {
	@FindBy(xpath="//*[@id=\"main-content\"]/div[1]/div/div/div[3]/ul/li[1]/article/div[1]/a/img")WebElement Jumpsuit;
	WebDriver dr;
	jumsuit(WebDriver dr){
	PageFactory.initElements(dr, this);	
		this.dr=dr;
		
	}
	
	
	
	



	@When("^i click on first item$")
	public JumpsuitwithTieBelt i_click_on_first_item() throws Throwable {
		dr.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[3]/ul/li[1]/article/div[1]/a/img")).click();
		
		return new JumpsuitwithTieBelt(dr);
		

	}

	

}
