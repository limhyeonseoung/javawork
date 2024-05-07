package _02_variable02;

public class T01_var {

	public static void main(String[] args) {
/* 기본자료형 
 * 정수 : int
 * 실수 : double
 * 참,거짓 : boolean
 * 문자1개 : char(유니코드 사용)
 */
		
//		정수타입 : byte(1byte), char(2byte), short, int, long
//		ctrl + /
		
int num1;
int num2 = 10;

num1=11;
System.out.println(num1);
System.out.println(num2);

System.out.println(num1+num2);
System.out.println(num1*2+num2);

int sum=num1+num2;
System.out.println(sum);
System.out.println("num1+num2 =" + sum);
// 변수를 하나 만들어 sum + 5 를 한 결과를 넣으시오 . 그리고 출력하시오.
int num3 = sum+5;
System.out.println(num3);

long long01 = 50000000000L;

double doub01 =37.93413513;
System.out.println(doub01);
double doub02 = 78.9283;
System.out.println(doub01+doub02);
//기본자료형 8byte 를 float 4byte 에(큰자료형을 작은 자료형) 넣어서 오류남
float float01 = 45.215952323f;
//float 형은 뒤에f를 서식 (소수점 6자리까지 정확)
//보통 float 보다 double 을 사용한다 (뒤에 f 넣어서 귀찮음)
float float02 = 22.523525235f;
System.out.println(float01+float02);



	}

}
