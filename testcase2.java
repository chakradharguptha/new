package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//help option
public class testcase2 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		// driver.manage().window().maximize();
		driver.get("https://www.eazydiner.com/");
		driver.findElement(By.id("help")).click();
		System.out.println(driver.getTitle());
		String s = driver.getTitle();
		System.out.println(s);

	}

}
