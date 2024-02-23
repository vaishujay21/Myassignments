package week3.homeassignments;

public class Myconcreteclass extends Absclass{
	
	@Override
	void Connectionissue() {
		// TODO Auto-generated method stub
		System.out.println("This is coming  abs class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myconcreteclass con = new Myconcreteclass();

		con.connect();

		con.disconnect();

		con.executeUpdate();
		con.Connectionissue();
	}

	
}
