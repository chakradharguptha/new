package automation;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//about us
public class testcase1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		// driver.manage().window().maximize();
		driver.get("https://www.eazydiner.com/");

		driver.findElement(By.xpath("//*[contains(@href,'/static/about-us')]")).click();
	String s = driver.getTitle();
		System.out.println(s);
		
}

	}


