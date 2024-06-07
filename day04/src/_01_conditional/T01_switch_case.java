package _01_conditional;

import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
		// swich_case
		/*
		int num1 = 2;  // 0 ~ 2만 들어있는 변수
		
		switch(num1){case 1 : System.out.println("1입니다");
		                      break;
		             case 2 : System.out.println("2입니다");}      
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 (0 ~ 2 숫자만) :");
		int num2 = sc.nextInt();
	    
		switch(num2) {case 0 : System.out.println("0입력함");
                               break;
		              case 1 : System.out.println("1입력함");
                               break;
		              case 2 : System.out.println("2입력함");
                      break;
                     default : System.out.println("잘못입력");}
		
		char ch = 'k';  // k,l,p
		switch(ch) {case 'k' : System.out.println("김씨입니다");
		            break;
		            case 'l' : System.out.println("이씨입니다");
		            break;
		            case 'p' : System.out.println("박씨입니다");
		            break;
		           default : System.out.println("성이 김,이,박씨가 아닙니다");}
		
		char ch = 'l';
		switch(ch) {case 'k' : System.out.println("김씨입니다");
                    case 'l' : System.out.println("이씨입니다");
                    case 'p' : System.out.println("박씨입니다");
                   default : System.out.println("성이 김,이,박씨가 아닙니다");}
		
		
		int month = 8;
		switch(month) {case 12 :
		              
		                case 1 : 
		                        
		                case 2 : 
                                
		                case 3 : System.out.println("겨울");
                                 break;
                        
		                case 4 :   
		                	
		                case 5 : 
		                	
		                case 6 : System.out.println("봄");
		                         break;
		                
		                case 7 : 
		                	
		                case 8 : 
		                	
		                case 9 : System.out.println("여름");
		                         break;
		                         
		               case 10 : 
		                	
		               case 11 : System.out.println("가을");}
		               
		*/               
		
	// 문제1. 사용자로부터 2수와 연산자를 입력받아 연산결과를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자입력 :");
		int num01 = sc.nextInt();
		
		System.out.println("두번째 숫자입력 :");
		int num02 = sc.nextInt();
		
		System.out.println("연산자 입력 :");
		String plus = sc.next();
		
		switch(plus){ case "-" : System.out.println(num01 + " - " + num02 + " = " + (num01 - num02));
		                         break;
		              case "+" : System.out.println(num01 + " + " + num02 + " = " + (num01 + num02));
                                 break;
		              case "/" : System.out.println(num01 + " / " + num02 + " = " + ((double)num01 / num02));
                                 break;
		              case "*" : System.out.println(num01 + " * " + num02 + " = " + (num01 * num02));
                                 break;
		              case "%" : System.out.println("결과값 : " + num01 + " % " + num02 + " = " + ((double)num01 % num02));
                                 break;}
                                 
		                         
		             
		                         
		
		
				
		
		
		
	
	
		                	
		                
		                
		                        
		                        
		

		
		 
		            
		

	}

}
