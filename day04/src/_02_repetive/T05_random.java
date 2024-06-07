package _02_repetive;

public class T05_random {

	public static void main(String[] args) {
		// Math클래스 (수학에 관련된 클래스)		
		double rand1 = Math.random();
		System.out.println(rand1); // 0 ~ 0.999999999
		
		// 0 ~ 9.999999999
		rand1 = Math.random() * 10;
		System.out.println(rand1);
		
		//정수만, 0~9
		int rand2 = (int)rand1;
		System.out.println(rand2); 
		
		//1~10까지
		int rand3 = (int)rand1 + 1;
		System.out.println(rand3);
		
	    //0~4까지
		int rand4 =(int)(Math.random()*5);
		System.out.println(rand4);
		
		//1~5까지
		int rand5 = rand4 + 1;
		System.out.println(rand5);
		
		
		
		
		

	}

}
