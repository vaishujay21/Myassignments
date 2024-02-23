package week3.homeassignments;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
        char[] chars = test.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        
        // Print the modified characters as a new String
        System.out.println(new String(chars));  
	}

}
