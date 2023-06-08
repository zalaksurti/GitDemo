import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Basic1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesha\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		// driver.close();
		driver.findElement(By.id("inputUsername")).sendKeys("name");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacamy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		// Assert.(driver.findElement(By.tagName("p")).getText(), "You are successfully
		// logged in.");args
		// Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container']
		// h2")).getText(),"Hello "+name+",");

		// driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		driver.findElement(By.linkText("Forgot your password?")).click();
		/* Forgot Password */
		driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("new@abc.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("name");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[text()='Log Out']")).click();

	}
/*
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passwordtxt= driver.findElement(By.cssSelector("p.infoMsg")).getText();
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordarray= passwordtxt.split("'");
		String password = passwordarray[1].split("'")[0];
		return password;
		
	}*/
	
	
	
	
	
	
	
}
