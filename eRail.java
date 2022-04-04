package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eRail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("TPJ",Keys.TAB);
			
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MS",Keys.TAB);	
		
		WebElement datesort = driver.findElement(By.id("chkSelectDateOnly"));

		if(datesort.isSelected()) {
			
			datesort.click();
			
		}
		else {
			
			System.out.println("Element is not selected");
		}
		
		WebElement table = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		WebElement singleRow = row.get(1);
		
		List<WebElement> col = singleRow.findElements(By.tagName("td"));
		System.out.println(col.size());
		
		for(int i=1; i<row.size(); i++) {
			WebElement rowentry = row.get(i);
			List<WebElement> colvalue = rowentry.findElements(By.tagName("td"));
			WebElement colelement = colvalue.get(0);
			String TrainNumber = colelement.getText();
			System.out.println(TrainNumber);
			
		}
		

	}

}
