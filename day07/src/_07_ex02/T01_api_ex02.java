package _07_ex02;
  	
public class T01_api_ex02 {
	String empName = "홍길동";
	String dept = "영업부";
	String job = "과장";
	int salary = 2500000;
	double bp = 0.05;
	String ph = "010-1234-5678";
	String ad = "서울시 강남구";
	
	void method(int salary,double bp) {
		System.out.println("보너스 : " + (double)(salary/bp));

		
	}

}
