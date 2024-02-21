package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/parent::div/button")).click();
		String title = driver.getTitle();
		String expectedTitle = "Dashboard";
        System.out.println("Page title: " + title);
        
        if (title.equals(expectedTitle)==true) {
        	System.out.println("Title name is dashboard ");
        } else {
        	System.out.println("Title name is not dashboard");

	}
        driver.navigate().back();
        WebElement own = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/parent::div/button//span[text()='Disabled']"));
        boolean enabled = own.isEnabled();
		System.out.println("value is"+enabled);
if (enabled==true) {
	System.out.println("It is disabled");
} else {
	System.out.println("It is not disabled");
}
	List<WebElement> but = driver.findElements(By.xpath("//button[contains(@class,'button-text-icon-left')]"));
	String buttonText = "Submit";

    // 6. Iterate through the list of buttons to find the position of the button with the specified text
    int position = -1; // Initialize the position to -1 (not found)
    for (int i = 0; i < but.size(); i++) {
        WebElement button = but.get(i);
        if (button.getText().equals(buttonText)) {
            position = i;
            break; // Exit the loop once the button is found
        }
    }

    // 7. Print the position of the button
    if (position != -1) {
        System.out.println("The position of the button with text '" + buttonText + "' is: " + position);
    } else {
        System.out.println("The button with text '" + buttonText + "' was not found on the page.");
    }

	WebElement color = driver.findElement(By.xpath( "//h5[text()='Find the Save button color']/parent::div/button//span[text()='Save']"));
	String backgroundColor = color.getCssValue("background-color");
	System.out.println("The background color of the button is: " + backgroundColor);
	WebElement size = driver.findElement(By.xpath(" //h5[text()='Find the height and width of this button']/parent::div/button//span[text()='Submit']"));
	int width = size.getSize().getWidth();
    int height = size.getSize().getHeight();
    System.out.println("The width of the button is: " + width + "px");
    System.out.println("The height of the button is: " + height + "px");
    driver.quit();
    
	
	

}
}
