package _02_conditional;

import java.util.Scanner;

public class T03_multi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 :");
		int score =sc.nextInt();
		
		if(score > 100)
			System.out.println("100점 이상을 입력할 수 없습니다");
		else if(score >= 90)		
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("c학점");
		else if(score >= 60)
			System.out.println("D학점");
		else if(score > 0)
			System.out.println("F학점");
		else
			System.out.println("점수는 음수가 될 수 없습니다");
		
		
		
		  
			
		

	}

}
