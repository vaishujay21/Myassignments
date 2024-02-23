package week3.homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortusingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"HCL","Wipro","Aspire Systems", "CTS"};
		List<String> company = new ArrayList<String>();
		for (String str : stringArray) {
			company.add(str);
			
		}
		Collections.sort(company);
		for (int i = stringArray.length-1; i >= 0; i--) {
			
			System.out.println(company.get(i));
		}
		
		
		
		

		
	}

}
