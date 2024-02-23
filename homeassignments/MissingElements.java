package week3.homeassignments;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElements {

public static void main(String[] args) {

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10, 6, 8);
	Collections.sort(numbers);
    //System.out.println(numbers);
	for(int i=1;i<numbers.size();i++) {
    if(numbers.get(i)-numbers.get(i-1)>1)
    {
    int curr = numbers.get(i);//8
    int prev = numbers.get(i-1)+1;//6//7
    while(prev!=curr){
    System.out.println(prev);
    prev++;
}
}
}
}
}

