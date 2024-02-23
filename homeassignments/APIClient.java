package week3.homeassignments;

public class APIClient {

	
public void sendRequest()
	
	{
		System.out.println("End point");
		
	}
	
	public void sendRequest(String endpoint)
	
	{
		System.out.println("End point is: "+endpoint);
		
	}
	
public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	
	{
		System.out.println("Endpoint is: "+ endpoint + " requestBody is "+ requestBody + "  requestStatus is "+ requestStatus);
		
	}
	
	public static void main(String[] args) {
		APIClient mo = new APIClient();
		mo.sendRequest();
		mo.sendRequest("http://7589/23.345");
		mo.sendRequest("http://8787/23.345", "Soap body", false);

	}

}
