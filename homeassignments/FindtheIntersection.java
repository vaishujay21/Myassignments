package week3.homeassignments;


import java.util.Arrays;
import java.util.List;
public class FindtheIntersection {
	public static void main(String[] args) {	
		// TODO Auto-generated method stub		
		List<Integer> num1 = Arrays.asList(3, 2, 11, 4, 6, 7);	
		List<Integer> num2 = Arrays.asList(1, 2, 8, 4, 9, 7);	 
		for (Integer num : num1) {	 		 	
			for (Integer numie : num2) {	 			 		
				if(numie==num) {	 			
					System.out.println(num);	 			
					break;	 		}							
				}					}		
		}
	}
	