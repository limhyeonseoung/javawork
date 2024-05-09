package day03_EX;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 :");
		int num1 = sc.nextInt();
		
		System.out.print("수학점수 :");
		int num2 = sc.nextInt();
		
		System.out.print("영어점수 :");
		int num3 = sc.nextInt();
		
		System.out.print("한국사점수 :");
		int num4 = sc.nextInt();
		
		System.out.print("물리과학점수 :");
		int num5 = sc.nextInt();
		
		System.out.println("지구과학 :");
		int num6 = sc.nextInt();
		
		int sum = (num1 + num2 + num3 + num4 + num5+ num6);
		double avg =(sum / 6.0);
		System.out.println("평균점수 : " +avg);
		
		if(avg>=90)
			System.out.println("학점:A");
		else if(avg>=80)
			System.out.println("학점:B");
		else if(avg>=70)
			System.out.println("학점:c");
		else if(avg>=60)
			System.out.println("학점:D");
		else
			System.out.println("학점:F");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	   
	    
	    
	    

	}

}
