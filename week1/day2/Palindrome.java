package week1.day2;

public class Palindrome {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {

			// TODO Auto-generated method stub
				
				
				int input= 12121;
				int output=0;
				int remainder;
				int temp=input;
				for (int j =input ; j > 0; j /=10) {
					remainder = j%10;//12121%10=1
					output= (output*10)+ remainder;//(0*10)+1=1
					//12121/10=1212;
				}
				
					if (output==temp) {
						
						System.out.println("This is Palindrome");
						
					} else {
				        System.out.println("This is not Palindrome");
					}
					

	
}
	}




