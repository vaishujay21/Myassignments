package week3.homeassignments;

public class Elements extends Button {

public void mylastclass()
	{
System.out.println("My last class");

}

public static void main(String[] args) {
		
Elements e = new Elements();
Radiobutton r = new Radiobutton();
CheckBoxButton c = new CheckBoxButton();
Textfield t = new Textfield();
e.click();
e.submit();
e.setText(" Red");
e.mylastclass();
r.selectRadioButton();
c.clickCheckButton();
t.gettext();

}

}


