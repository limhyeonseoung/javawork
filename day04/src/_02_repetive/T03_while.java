package _02_repetive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/*
		 while(조건식){
		       조건식이 참일 때 수행
		 }      
		 */
		
		
		
		/*
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
		*/
		
		
		/*
		
		int i = 1;  // 초기식
		while(i<=10) {  //조건식
			System.out.println(i);  //실행
			i+=2;  //증강식
		}
		
		int j = 10;
	    while(true) {
	    	if(j==0)
	    		break;
	    	System.out.println(j);
	    	j--;
	    }
		
	   
	    int sum = 0;
	    for(int j=1; j<=100; j++){
	    	sum += j;
	    }
	    System.out.println("1부터100까지의 합 : " + sum);
	    
	    
	    sum = 0;   
	    int k = 1;
	    while(k<=100){
	    	sum += k;
	    	k++;
	    }	    	
	    System.out.println("1부터100까지의 합" + sum);		
	    
	    
	    
	    int x = 10;
	    
	    while(x !=0) {
	    	System.out.println(x);
	    	x--;
	    }
	  
	    
	    
	    // break : 반복문을 빠져 나온다
		
		int count = 0;
		while(true) {
			System.out.println(++count);
			if(count == 5)
				break;
		}
	    
		  
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("멈추려면 'q'를 넣으시오 : ");
		    char ch = scan.next().charAt(0);
		    
		    if(ch == 'q')
		    	break;
		}
		System.out.println("프로그램이 종료되었습니다");
	    
	  	*/
		
		
		//문1. 사용자로부터 연살할 2숫자와 연산자를 입력받아 그 결과를 출력
	    //     연산자에 @ 멈추고 그렇지 않으면 계속 입력받아 결과출력
		/*
		 ex)  연산할 연산자와 2숫자 입력 : 4 + 9
		      4+9=13
		      4*9=36
		      연산할 연산자와 2숫자 입력 : @ 4 9
		      프로그램을 종료합니다
		 */
		
		Scanner scan = new Scanner(System.in);
	    
		
		while(true) {
			System.out.println("연살한 연산자와 2개의 숫자 입력(끝내려면 '@'입력)   ex) + 3 6 = 9");
			char op =scan.next().charAt(0);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if( op == '@')
				break;
			
			switch(op) { case '+' : System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
					                break;
			
			             case '*' : System.out.println(num1 + "*" + num2 + "=" + (num1+num2));
				                    break;
				                    
			}
			
								 
		}
		System.out.println("프로그램 종료");
		
		
	
	    		

	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
