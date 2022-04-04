package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorttable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		List<WebElement> getrow = driver.findElements(By.xpath("//ul[@id='sortable']/li")); 
		
		WebElement drag = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]")); 
		
		WebElement drop = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][7]")); 
		Actions build = new Actions(driver); 
	    
		 for(int i = 1;i<=getrow.size();i++) { 
			 drag = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']["+i+"]")); 
			 drop = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']["+getrow.size()+"]")); 
			 
			 build.clickAndHold(drop).dragAndDrop(drag, drop).perform(); 

	}

	}

}
