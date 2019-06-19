package a2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Selenium\\Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("test");		
	}
}
