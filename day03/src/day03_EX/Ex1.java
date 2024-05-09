package day03_EX;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// 1번문제
		Scanner scan = new Scanner (System.in);
		/*
		System.out.println("정수입력 : " );
		int num1 = scan.nextInt();
		
		
		String re1 = num1 > 0 ? "양수다" : "양수가 아니다";
		System.out.println(re1);
		
		// 2번문제
		System.out.println("정수입력 : ");
		int num2 = scan.nextInt();
		
		String re2 = num2 > 0 ? "양수다" : num2 == 0 ?  "0이다" : "음수다";
		System.out.println(re2);
		
		//3번문제
		System.out.println("정수 입력 : ");
		int num3 = scan.nextInt();
		
		String re3 = num3 % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(re3);
		
		
		//4번문제
		System.out.println("인원수 : ");
		int person = scan.nextInt();
		System.out.println("사탕 갯수 : ");
		int candy = scan.nextInt();
		
		int share = candy / person;
		int remainder = candy % person;
		System.out.println("1인당 사탕 갯수 : " + share);
		System.out.println("남은 사탕 갯수 : " + remainder);
		
		
		
		//5문제
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.println("학년(숫자만) : ");
		int grade = scan.nextInt();
		
		System.out.println("반 : ");
		int gradeClass = scan.nextInt();
		
		System.out.println("번호 :");
		int calssNum = scan.nextInt();
		
		System.out.println("성별(M/F) :");
		String gender = scan.next();
		
		System.out.println("성적(소수점 둘째자리까지):");
		double score = scan.nextDouble();
		
		String genderRe = gender.equals("M") ? "남학생" : "여학생";
		
		System.out.printf("%d학년 %반 %번 %s %s의 성적은 %.2f 이다." ,
				          grade, gradeClass,calssNum,name,genderRe,score);
		
		//char 기본자료형을 받을때 ( == 값이 같은가 ? )
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.println("학년(숫자만) : ");
		int grade = scan.nextInt();
		
		System.out.println("반 : ");
		int gradeClass = scan.nextInt();
		
		System.out.println("번호 :");
		int calssNum = scan.nextInt();
		
		System.out.println("성별(M/F) :");
		char gender = scan.next().charAt(0);
		
		System.out.println("성적(소수점 둘째자리까지):");
		double score = scan.nextDouble();
		
		String genderRe = gender == 'M' ? "남학생" : "여학생";
		
		System.out.printf("%d학년 %반 %번 %s %s의 성적은 %.2f 이다." ,
				          grade, gradeClass,calssNum,name,genderRe,score);
	
		//6번문제
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		//String re4 = age <= 13 ? "어린이" : age <= 19 "청소년" : "성인";
		String re4 = age <= 13 ? "어린이" : age > 13 && age <=19 ? "청소년" : "성인";
		System.out.println(re4);
		 
		//7번문제
		System.out.print("국어,영어,수학 점수 입력(공백으로 분리) :");
		int kor =scan.nextInt();
		int eng =scan.nextInt();
		int mat =scan.nextInt();
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
		String re7 = kor >=40 && eng >=40  && mat >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(re7);
		
		//8번문제
		System.out.print("주민번호 입력(-도 포함) :");
	    char num8 = scan.next().charAt(7);
		
		String re8 = num8 == '1' || num8 == '3' ? "남자" : "여자";
		System.out.println(re8);
		*/
		//9번문제
		System.out.print("정수 입력(공백으로 분리) :");
		int num9 =scan.nextInt();
		int num10 = scan.nextInt();
		int num11 = scan.nextInt();
		
		boolean re9 = num11 <= num9 || num11 > num10;
		System.out.println(re9);
		
		//10번문제
		boolean re10 = num9 == num10 && num10 == num11;
		System.out.println(re10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
				
	}

}
