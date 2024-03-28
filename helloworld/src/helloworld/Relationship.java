package helloworld;

public class Relationship {
	static String status = "single";
	
	String status(String status)
	{
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relationship status = new Relationship();
		
		System.out.println("staus :" + status.status(" ") + Relationship.status ) ;
		System.out.println("staus :" + status.status(" ") + status.status ) ;

	}

}
