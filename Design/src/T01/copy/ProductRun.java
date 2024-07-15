package T01.copy;

import java.util.Calendar;

public class ProductRun {

	public static void main(String[] args) {
		Product p1 = ProductFactory.getInstance("tv");
		System.out.println(p1);
		
		Product p2 = ProductFactory.getInstance("computer");
		System.out.println(p2);
		
		System.out.println(Calendar.getInstance().getClass());
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
		

	}

}
