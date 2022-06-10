package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * pom login page for skilrary
 * @author lohith
 *
 */

public class SkillraryLogin {
	/**
	 * skillrary login page
	 * pom 
	 * declaration
	 */
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement loginButton;
	/**
	 * skillrary login page
	 * pom
	 * initilization
	 * 
	 */
	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	/**
	 * pom
	 * utilisation
	 * 
	 */
	public void un(String user) {
		userName.sendKeys(user);
	}
	public void pw(String pass) {
		passWord.sendKeys(pass);
	}
	public void ln() {
		loginButton.click();
	}
	
	

}
