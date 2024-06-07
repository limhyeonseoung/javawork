package _02_repetive;

public class T01_for {

	public static void main(String[] args) {
		// 반복문
		/*
		 반복문 3가지 : for, while, do-while
		 특정한 규칙이 있는 것들을 반복하여 사용할 때
		 */
		
		//for(초기화; 조건식; 증감식){     실행문      }
				
		for(int i=1; i< 5;i++) {System.out.println(i + ".안녕하세요");}

		for(int i=1; i<=9;i+=2) {System.out.println(i + "번출력");}
		
		for(int i=5;i>=1;i--) {System.out.println(i+"분");}
		
		for(int i=10;i>=1;i-=2) {System.out.println(i+"시간");}
		
		//1~100 까지의 합계를 구하시오.
		
		int sum = 0;
		for(int i=1;i<=100;i++) {sum+=i;}	
		System.out.println("1~100까지의 합 : " + sum);
		                        
		sum = 0;
		for(int i=1;i<=10;i++) {if(i%3==0)
			                     sum +=i;}
		System.out.println("1~100까지 3의 배수의합 :" + sum);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
