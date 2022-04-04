package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement tableName = driver.findElement(By.id("table_id"));
		List<WebElement> row = tableName.findElements(By.tagName("tr"));
		int size = row.size();
		System.out.println(size);
		
		WebElement col = row.get(1);
		List<WebElement> column = col.findElements(By.tagName("td"));
		int size2 = column.size();
		System.out.println(size2);
		
		for (int i=1; i <size; i++) {
			
			WebElement rowValue = row.get(i);
			List<WebElement> colVal = rowValue.findElements(By.tagName("td"));
			String Colcontents = colVal.get(1).getText();
			System.out.println(Colcontents);
		}
		
	}

}
