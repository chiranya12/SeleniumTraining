package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Driver\\chromedriver.exe");
		// The below line will open a chrome browser window
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.walmart.com/");

		System.setProperty("webdriver.edge.driver", "C:\\Users\\chira\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Driver\\msedgedriver.exe");
		WebDriver edgedriver = new EdgeDriver();
		edgedriver.get("https://www.flipkart.com/");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chira\\eclipse-workspace\\SeleniumTraining\\Hello-World\\src\\test\\resources\\Driver\\geckodriver.exe");
		WebDriver fireFoxdriver = new FirefoxDriver();
		edgedriver.get("https://www.amazon.com/");
		
		
	}
}