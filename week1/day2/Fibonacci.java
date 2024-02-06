package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =7,firstnum=0,secondnum=1;
int nextnum;
for (int i = 0; i <=n; i++) {
	System.out.print(firstnum +",");
	nextnum=firstnum+secondnum;
	firstnum=secondnum;
	secondnum=nextnum;
	
}

	}

}
