package week1.day2;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1, 4,3,2,8, 6, 7};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
		if(i+1!=num[i])	{
			System.out.println("Missing number is:"+(i+1));
			break;
			
		}
		}
		
	}

}
