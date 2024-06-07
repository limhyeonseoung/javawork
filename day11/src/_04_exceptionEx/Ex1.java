package _04_exceptionEx;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1%num2 == 0) {
			System.out.println("true");
		}
	    else
				System.out.println("false");
		
		try {
			
	
		}catch(Exception e) {
			System.out.println("1~100사이의 숫자가 아닙니다");
			
		}
		
		

			
	
		
		
		

	}

}
