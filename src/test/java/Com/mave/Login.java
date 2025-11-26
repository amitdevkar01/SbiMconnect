package Com.mave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://sbiluatposservices.sbilife.co.in/MconnectDemo/#/Pre/login");
       driver.findElement(By.id("edt_usercode")).sendKeys("990134795");
       driver.findElement(By.name("password")).sendKeys("sbil");
       driver.findElement(By.name("submit")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("Code_conduct")).click();
       driver.findElement(By.xpath("//a[text()='Confirm']")).click();
       Thread.sleep(7000);
       
       driver.findElement(By.xpath("//button[text()='+ New Application']")).click();
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("#carouselExampleIndicators > div.carousel-inner > div.carousel-item.active > div > div.col-md-5 > div > button > span.mdc-button__label")).click();
       
//       personal information
       driver.findElement(By.id("Fname")).sendKeys("sunil");
       Thread.sleep(2000);
       driver.findElement(By.id("mat-input-3")).sendKeys("Vijay");
       Thread.sleep(2000);
       driver.findElement(By.id("Lname")).sendKeys("Pande");
       Thread.sleep(2000);
       driver.findElement(By.id("str_mobile_number")).sendKeys("7507736521");
       Thread.sleep(2000);
       driver.findElement(By.id("mat-input-6")).sendKeys("11-12-1995");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[@role=\"radio\"])[2]")).click();
       Thread.sleep(2000);	
       driver.findElement(By.id("mat-input-8")).sendKeys("216525635456");
       Thread.sleep(2000);
//       driver.findElement(By.xpath("//input[@placeholder=\"Enter Email ID\"]")).sendKeys("sunil1211");
//       driver.findElement(By.id("mat-select-value-5")).click();
       
//       driver.findElement(By.xpath("//span[text()='@Gmail.com']")).click();
       driver.findElement(By.id("EC_accountNumber")).sendKeys("085127211006525");
       Thread.sleep(2000);
       driver.findElement(By.id("EC_ifscCode")).sendKeys("klif0000851");
       Thread.sleep(2000);
       driver.findElement(By.id("mat-mdc-checkbox-1-input")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Proceed']")).click();
       
       
       

       
		
		
	}

}
