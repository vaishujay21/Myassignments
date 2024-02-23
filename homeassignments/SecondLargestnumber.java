package week3.homeassignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(3, 2, 11, 4, 6, 7);
		Collections.sort(numbers);
		System.out.println("After sorting:"+numbers);
		int secondLargest = numbers.get(numbers.size() - 2);
		System.out.println("The second largest number in the array is "+secondLargest);
		
	}

}
