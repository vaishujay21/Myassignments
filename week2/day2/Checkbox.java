package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		WebElement alertpage = driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]"));
		alertpage.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		By alert=By.xpath("//span[text()='Checked']");
	    wait.until(ExpectedConditions.presenceOfElementLocated(alert));
	    //Alert alert = driver.switchTo().alert();
        String alertMessage =driver.findElement(alert).getText();
	    System.out.println("Alert message: " + alertMessage);
        driver.findElement(By.xpath("//label[text()='Java']/ancestor::td")).click();
        driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/parent::div//div[2]")).click();
        WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'slider')]"));
		slider.click();
		WebDriverWait waiting = new WebDriverWait(driver,Duration.ofSeconds(30));
		By slide=By.xpath("//span[text()='Checked']");
		waiting.until(ExpectedConditions.presenceOfElementLocated(slide));
		String ams =driver.findElement(slide).getText();
		System.out.println("Alert message:" + ams);
		WebElement own = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		//System.out.println("text is"+own.getText());
		boolean enabled = own.isEnabled();
		System.out.println("value is"+enabled);
if (enabled==false) {
	System.out.println("It's disabled ");
} else {
	System.out.println("It's enabled");

}
driver.findElement(By.xpath("//ul[@data-label='Cities']/parent::div")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-item ui-selectcheckboxmenu')]")).click();

        
        
		
		
	}

}
