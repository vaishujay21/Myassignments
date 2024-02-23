package week3.homeassignments;

public class ReverseOddWords {
	public static void main(String[] args) {				
		String sent = "I am a software tester";	
		String[] arr = sent.split(" ");		
		String[] revarr = new String[arr.length];	
		String revsent="";		
		for (int i = 0; i < arr.length; i++) {	
			if (i%2==1) {				
				char[] revv = new char[arr[i].length()];
				//System.out.println("This is odd word: "+arr[i]+" ");
				char[] data = arr[i].toCharArray();				
				for (int j = data.length-1; j>=0 ; j--) {		
					//System.out.println(data[j]);					
					revv[data.length-1-j]=	data[j];	
					}				String revword = new String(revv);//
					//System.out.println(revword);
					revarr[i]=revword;			}	
			else {//				System.out.println(arr[i]);			
				revarr[i]=arr[i];			}					
			}		
		for (int l = 0; l <= revarr.length-1; l++) {	
			revsent = revsent.concat(revarr[l]).concat(" ");	
			}		System.out.println(revsent);			}
				
			}
		
	

