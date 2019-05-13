package regressionCases;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class SendFeedback {
	
	public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
        driver.get("https://www.navigator.ba/#/feedback");
		
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		driver.findElement(By.xpath("//input[@name='name_surname']")).sendKeys("Test");
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Amazing app");
		driver.findElement(By.xpath("//input[@class='btn green-button']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	};

}
