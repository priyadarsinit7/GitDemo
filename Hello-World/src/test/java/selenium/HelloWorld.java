package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/Users/priya/sdet-workspace/Hello-World/src/test/resources/drivers/chromedriver");
		
		WebDriver chromeDriver = new ChromeDriver(); 
		chromeDriver.get("https://amazon.com");
		
	}

}
