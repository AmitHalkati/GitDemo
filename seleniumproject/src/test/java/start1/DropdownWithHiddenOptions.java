package start1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropdownWithHiddenOptions {

	public static void main(String[] args) throws InterruptedException {
		 
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      driver.manage().window().maximize();
	 
	     
	      driver.findElement(By.name("username")).sendKeys("Admin");
	      
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	      
	      driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();

          driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
          
          List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
          
          for(WebElement option:options)
          {
        	  
        	 // System.out.println(option.getText());
        	  
        		 if(option.equals("Automaton Tester"))
        		  {
        			  option.click();
        			  break; 			  
        			 
        		 
        		 
        	  }
          }

	}
}


