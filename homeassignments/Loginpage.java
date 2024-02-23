package week3.homeassignments;

public class Loginpage extends BasePage {


	public void performCommonTasks()
	{
		System.out.println("This is overriding the super class");
	}
	
	public static void main(String[] args) {
		
		Loginpage lo = new Loginpage();
		lo.clickElement();
		lo.findElement();
		lo.enterText();
		lo.performCommonTasks();
	}

}
