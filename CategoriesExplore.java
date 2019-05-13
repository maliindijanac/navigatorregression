package regressionCases;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class CategoriesExplore {
	
public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
        driver.get("https://www.navigator.ba/#/categories");
		
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.findElement(By.xpath("//div[@class='description']")).click();
		driver.findElement(By.xpath("//li[@data-place-id='3226']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.pozoristemladih.ba']")).click();
		
		driver.close();
};

}