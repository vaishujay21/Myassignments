package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Testuserstockholm1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement data = driver.findElement(By.name("industryEnumId"));
		Select opt=new Select(data);
		opt.selectByVisibleText("Computer Software");
		WebElement own = driver.findElement(By.name("ownershipEnumId"));
		Select myown = new Select(own);
		myown.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sour = new Select(source);
		sour.selectByValue("LEAD_EMPLOYEE");
		WebElement dropdown = driver.findElement(By.id("marketingCampaignId"));
		Select drp = new Select(dropdown);
		drp.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stt = new Select(state);
		stt.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.id("sectionHeaderTitle_accounts"));
		driver.findElement(By.className("tabletext"));
		driver.close();
		
		
		
		
	}

}
