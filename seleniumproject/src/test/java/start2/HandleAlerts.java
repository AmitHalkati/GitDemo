package start2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		//Explicit wait pass it
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		  driver.manage().window().maximize();
		  //driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		  
		  driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		  
		  
		  // below you can use any one
		  Alert alertwindow = driver.switchTo().alert();		  
		 // Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
		  
		  System.out.println(alertwindow.getText());
		  //alertwindow.accept();// this will close alert window using ok button
		  //alertwindow.dismiss();// if you want to cancel
		  
		  alertwindow.sendKeys("Welcome");
		  
		  alertwindow.accept();
		  
		  String act_text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		  String exp_text = "You entered: welcome";
		  
		  if(act_text.equals(exp_text))
		  {
			  System.out.println("Passed");
		  }
		  else
		  {
			  System.out.println("Failed");
		  }

	}

}
