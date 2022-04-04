package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecttable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			

			WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']")); 
			WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']")); 
			WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']")); 
			WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']")); 
			WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']")); 
			WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']")); 
			WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));

			Actions build = new Actions(driver);
				
			build.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).click(item5).click(item6).click(item7).keyUp(Keys.CONTROL).perform();
			

	}

}
