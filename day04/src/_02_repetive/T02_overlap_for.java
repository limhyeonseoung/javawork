package _02_repetive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println("i=" + i + ", j=" +j);
				
			}
		}
 
		// 구구단		
		for(int d=2;d<=9;d++) {
			System.out.println("***"+d+"단"+"***");
			for(int b=1;b<=9;b++)
				System.out.println(d+"*"+b+"="+(d*b));
			
			
		//사용자로부터 숫자를 입력받아 별출력
			
		
			Scanner scan = new Scanner(System.in);
			System.out.println("*의 갯수 :");
			int s =scan.nextInt();
			
			for(int i=1;i<=s;i++) {
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
				*/
		
		//내가한 구구단   
		        System.out.println("  2단          3단          4단         5단         6단           7단          8단         9단");
				for(int i=1;i<=9;i++) {
					for(int j=2;j<=9;j++) {
						System.out.printf("%d*%d =%2d"+"     ",j,i,j*i);
					}
					System.out.println();
				}
				
		//교수님이 한거
				
		       
			
			

			
		
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
