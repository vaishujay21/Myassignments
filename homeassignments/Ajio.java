package week3.homeassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.tagName("input")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(@class,'genderfilter facet-linkname-Men')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		Thread.sleep(3000);
		String loc = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).getText();
		System.out.println(loc);
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		for (WebElement j : brand) {
			
			String text = j.getText();
			System.out.println(text);
			
		}
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement r : name) {
			
			String names = r.getText();
			System.out.println(names);
			
		}
	}
}
