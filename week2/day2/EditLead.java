package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath(" //input[@id='createLeadForm_companyName']")).sendKeys("SWEDTestLeaf");
		driver.findElement(By.xpath(" //input[@id='createLeadForm_firstName']")).sendKeys("Stockholms swe");
		driver.findElement(By.xpath(" //input[@id='createLeadForm_lastName']")).sendKeys("Odenplann");
		driver.findElement(By.xpath(" //input[@id='createLeadForm_firstNameLocal']")).sendKeys("Lindt");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName'] ")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description'] ")).sendKeys("description of the field");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail'] ")).sendKeys("testleafstockholms@gmail.com");
		WebElement own = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select myown = new Select(own);
		myown.selectByVisibleText("New York");
		driver.findElement(By.xpath(" //input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement inputField = driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		inputField.clear();
		//WebDriverWait waiting = new WebDriverWait(driver,Duration.ofSeconds(20));
		//By slide=By.xpath("//textarea[@id='createLeadForm_description'] ");
		//waiting.until(ExpectedConditions.elementToBeClickable(slide));
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote'] ")).sendKeys("description of the note");
		driver.findElement(By.xpath(" //input[@value='Update']")).click();
		String title = driver.getTitle();
		String expectedTitle = "View Lead | opentaps CRM";
        System.out.println("Page title: " + title);
        
        if (title.equals(expectedTitle)==true) {
        	System.out.println("This is view lead page");
        } else {
        	System.out.println("This is not view lead page");

	}
        driver.quit();
		
	}

}
