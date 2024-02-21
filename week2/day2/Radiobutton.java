package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//label[text() ='Chrome'])[1]")).click();
		driver.findElement(By.xpath("(//label[text() ='Chennai'])[1]")).click();
		driver.findElement(By.xpath("(//label[text() ='Chennai'])[1]")).click();
		WebElement own = driver.findElement(By.xpath("(//label[text() ='Safari'])[2]"));
		System.out.println("text is"+own.getText());
		boolean enabled = own.isEnabled();
		System.out.println("value is"+enabled);
if (enabled==true) {
	System.out.println("Safari is enabled");
} else {
	System.out.println("Safari is not enabled");

}
WebElement sel = driver.findElement(By.xpath("//label[text() ='21-40 Years']"));
boolean isSelected = sel.isSelected();
System.out.println("This is selected"+isSelected);
if(isSelected==true) {
System.out.println("age group is selected as 21-40 years ");
}
else {
System.out.println("age group is not selected as 21-40 years");	
	}
driver.quit();
}
}
