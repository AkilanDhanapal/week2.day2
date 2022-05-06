package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class accountlogin {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	WebElement a=driver.findElement(By.id("email"));
	a.sendKeys("kumar.testleaf@gmail.com");
	WebElement b=driver.findElement(By.id("password"));
	b.sendKeys("leaf@12");
	WebElement c=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/button"));
	c.click();
	String p=driver.findElement(By.xpath("/html/body/div/div[2]/h1")).getText();
	//WebElement e=driver.findElement(By.xpath("/html/body/div/div[2]/h1/strong"));
	//WebElement p=driver.findElement(By.xpath("/html/body/div/div[2]/h1/text()[2]"));
	System.out.println(p);
	WebElement d=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
	d.click();
	driver.quit();
}
}
