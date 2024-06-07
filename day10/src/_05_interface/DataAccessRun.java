package _05_interface;

public class DataAccessRun {

	public static void main(String[] args) {
				
		Oracle or1 = new Oracle();
		or1.select();
		or1.insert();
		or1.update();
		or1.delete();
	
		
		
		DataAccess ac1 = or1;
		ac1.select();
		ac1.insert();
		ac1.update();
		ac1.delete();
		
		
		
		
		
		
		
	
		

	}

}
