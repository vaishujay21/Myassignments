package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=13;
int count = 0;
for (int i = 1; i <=n; i++) {
	if(n%i==0)
	{
		count++;
	}
}
	
	if(count==2) {
		System.out.println("This is prime number"+n);
	}
	
	else
	{
		System.out.println("This is not prime number"+n);
	}
}
	}


