package start1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class OrangeHRMlogintest {

	public static void main(String[] args) throws InterruptedException {
		 
		
		//System.setProperty("WebDriver.chrome.driver" , "C:\\Users\\Amit\\Documents\\Drivers\\Chromedriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//Launch Browser
		//ChromeDriver driver = new ChromeDriver();
		
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	     // WebElement txtUserrname = driver.findElement(By.name("username"));
	      //txtUserrname.sendKeys("Admin");
	      driver.findElement(By.name("username")).sendKeys("Admin");
	      
	      driver.findElement(By.name("password")).sendKeys("admin123");

	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(5000);
	      
	      //Verify title on dashboard page
	     /* String act_title = driver.getTitle();
	      String exp_title ="OrangeHRM";
	      
	      if(act_title.equals(exp_title))
	      {
	    	 System.out.println("Test is Passed"); 	    	  
	      }
	      else
	      {
	    	  System.out.println("Failed"); 
	      }*/
	      String  act_label= null;
	      try
	      {
	       act_label = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	      }
	      catch(NoSuchElementException e)   {  }
	      
	      
	     String  exp_label = "Dashboard";
	      
	     
	     if(act_label.equals(exp_label))
	      {
	    	 System.out.println("Test is Passed"); 	    	  
	      }
	      else
	      {
	    	  System.out.println("Failed"); 
	      }
	      //driver.close();
	     	     
	      driver.quit();
	}

}
