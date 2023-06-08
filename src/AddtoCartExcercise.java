import java.util.List;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCartExcercise {

	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesha\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait w =new WebDriverWait(driver,5);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//implicitlyWait(2, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		String[] Veggies = { "Cucumber", "Brocolli","Beetroot","Beans" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItem(driver,Veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		

	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoinfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoinfo")).getText());
		
		
		
		
		
		
	}
	public static void addItem(WebDriver driver, String[] Veggies)
		
		{
			int j = 0;
		
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < Products.size(); i++)
		{

			String[] name = Products.get(i).getText().split("-");
			String formattedName=name[0].trim();

			List itemneededList = Arrays.asList(Veggies);

			
			if (itemneededList.contains(formattedName)) 
			{
				j++;
				// Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==Veggies.length)
				{
				break;
				}
		
			}
		}
		}
	}
