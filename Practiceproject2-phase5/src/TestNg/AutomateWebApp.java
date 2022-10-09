package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

;


public class AutomateWebApp {
	
	String driverPath="D:\\mphasis\\phase 5\\browser driver\\chromedriver.exe";
	public WebDriver wd;
	
	@Test(priority = 1)
	  public void register() {
		
	      System.setProperty("webdriver.chrome.driver", 
	    		  "D:\\mphasis\\phase 5\\browser driver\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("anand");
	      wd.findElement(By.id("ap_phone_number")).sendKeys("0123456789");
	      wd.findElement(By.id("ap_email")).sendKeys("anand010@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("anand@123");
	     wd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  
	     System.setProperty("webdriver.chrome.driver", 
	    		 "D:\\mphasis\\phase 5\\browser driver\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("anand010@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("anand@123");


	  }
	  @Test(priority = 3)
	  public void search() throws InterruptedException {
		  	
		  	System.setProperty("webdriver.chrome.driver", 
		  			"D:\\mphasis\\phase 5\\browser driver\\chromedriver.exe");
			  
			  wd = new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung phone");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		   wd.findElement(By.linkText("Samsung Galaxy S22 5G (Phantom Black, 12GB, 256GB Storage) | 5000mAh Battery | Travel Adapter to be Purchased Separately")).click();
	      
	  }
}
