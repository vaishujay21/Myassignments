package week3.homeassignments;

public abstract class Absclass implements DatabaseConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect this method");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect this method");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute this method");
	}

	abstract void  Connectionissue();
}


