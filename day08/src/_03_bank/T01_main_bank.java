package _03_bank;

public class T01_main_bank {

	public static void main(String[] args) {
		 T01_api_bank a1 = new  T01_api_bank();
		 
		 a1.deposit(1000);
		 System.out.println("잔액 : " + a1.getBalance());
		 
		 a1.witdraw(500);
		 System.out.println("잔액 : " + a1.getBalance());
		 
		 a1.witdraw(800);
		 
		 
		 
		 
		 

	}

}
