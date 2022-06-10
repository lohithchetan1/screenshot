package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pom.SkillraryLogin;
import pom.logo;
/**
 * 
 * @author lohith
 *
 */

public class Login extends Baseclass {

	@Test
	public void tc(){
		// TODO Auto-generated method stub
		/**
		 * opening browser and enter the url of skillrary
		 */
	
		
		/**
		 * creating object for pom and using 
		 */
		SkillraryLogin s=new SkillraryLogin(driver);
		s.un("admin");
		s.pw("admin");
		s.ln();
		
		
		logo l=new logo(driver);
		web.mouseHover(driver, l.getLogos());
		//l.getLogos();
	
	}

}
