package _02_conditional;

import java.util.Scanner;

public class T02_ifelse {

	public static void main(String[] args) {
       /*
        if(조건식){
           조건이 참일 때 실행할 프로그램
           }
        else {
           조건이 거짓일 때 실행할 프로그램
           }
        */
		
		int num1 = -100;
		if(num1>0)
			System.out.println("양수");
		else
			System.out.println("양수가 아니다");
		
		// 사용자부터 숫자하나를 입력받아 짝수, 홀수 구분
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num2 = scan.nextInt();
		if(num2 % 2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		
		
		

	}

}
