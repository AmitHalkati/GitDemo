package start2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		  
		  //Capture ids of browser windows
		  
		  Set<String> windowIDs = driver.getWindowHandles();
		  
		  List<String> windowidsList = new ArrayList(windowIDs); // converted set ---> List
		  
		  String parentwindowID=windowidsList.get(0);
		  String childwindowID=windowidsList.get(1);
		  
		  
		  //Switch to child window
		  
		  driver.switchTo().window(childwindowID);
		  driver.findElement(By.xpath("//body/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]/button[1]")).click();
		
		  //Switch to parent window
		  
		  driver.switchTo().window(parentwindowID);
		  driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		  driver.findElement(By.cssSelector("button[type='submit']")).click();
		  
		  
		  

	}

}
