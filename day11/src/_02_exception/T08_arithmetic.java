package _02_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("정수 2개 입력 ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();	
		System.out.println("나눈 몫 출력 : " + (int)(num1/num2));
		System.out.println("나눈 나머지 출력 : " + num1%num2);
				
		
  
	}

}
