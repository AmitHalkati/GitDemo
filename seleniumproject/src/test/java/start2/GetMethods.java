package start2;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	      driver.manage().window().maximize();
	      
	      System.out.println("Title of the page" + driver.getTitle());
	      System.out.println("Current URL" + driver.getCurrentUrl());
	      System.out.println("Page Source....................");
	     // System.out.println(driver.getPageSource());
	      
	      //System.out.println(driver.getWindowHandle());
	      
	      Thread.sleep(3000);
	      driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	      Set<String> windowids = driver.getWindowHandles();
	      
	      for(String winid:windowids)
	      {
	    	  System.out.println(winid);
	      }
	      
	}

}
