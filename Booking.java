package regressionCases;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;


public class Booking {
	
public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
        driver.get("https://www.navigator.ba/#/categories");
		
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		//unesi ime u search
		
        driver.findElement(By.xpath("//input[@class='ember-view ember-text-field tt-query']")).sendKeys("Ambrosia");
		
        
        //odaberi ponudjeno
        driver.findElement(By.xpath("//span[@class='tt-dropdown-menu']")).click();
        
        //klikni na event
        driver.findElement(By.xpath("//div[@class='event-type-show-name']")).click();
        
        //klikni na rezervaciju
        
       driver.findElement(By.xpath("//div[@class='book-ticket']")).click();
       
       //popuni formu za rezervaciju
        
       driver.findElement(By.xpath("//input[@id='txtName']")).sendKeys("Test");
       driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Test");
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amina.mehanovic.13@gmail.com");
       driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("033456789");
       
       driver.findElement(By.xpath("//input[@id='txtNmb']")).clear();
       driver.findElement(By.xpath("//input[@id='txtNmb']")).sendKeys("2");
       
       driver.findElement(By.xpath("//label[@class='btn btn-default active']")).click();
       
       driver.findElement(By.xpath("//input[@value='Rezerviši karte']")).click();
   	
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//body[@class='ember-application']")).click();
       
       //return home
       
       driver.get("https://www.navigator.ba/#/categories");
       
       driver.close();
	
	};

}


