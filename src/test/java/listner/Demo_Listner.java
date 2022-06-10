package listner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(listner.ListnerTest.class)
public class Demo_Listner extends Baseclass {

	@Test
    public void t1() {
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.id("")).click();
	

}
}