import java.io.InterruptedIOException;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIntro {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
//		List<WebElement> alllinks= driver.findElements(ByXPath("//a[]"));
//		System.out.println("Hello");
		
		Select dd=new Select(null);
		driver.close();
		driver.quit();
		
		
	}
	
}
