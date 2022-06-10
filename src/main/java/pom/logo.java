package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logo {
	
	
	

	@FindBy(xpath="//b[text()='SkillRary']")
	private WebElement logos;

	
	public logo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogos() {
		return logos;
	}

	

}
