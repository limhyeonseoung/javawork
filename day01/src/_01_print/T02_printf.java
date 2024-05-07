package _01_print;

public class T02_printf {

	public static void main(String[] args) {
		// 십진수 출력
		System.out.printf("%d\n",3);
		System.out.printf("%d, %d",10,20);
int num1=100;
int num2=200;
System.out.printf("%d, %d\n",num1,num2);

// 8진수 출력
System.out.printf("%on",9);
//16진수 출력
System.out.printf("%x\n",13);
System.out.printf("%X\n",13);

//실수형 출력
System.out.printf("%f/n",3.555555555);
//문자1개 출력
System.out.printf("%c\n", 'm');
//문자열 출력
System.out.printf("%b\n","abcedf");
//boolean타입 출력
System.out.printf("%b/n",true);
System.out.("%b\n",7>3);
// 현재는 2024년 5월이고 ,우리나라의 평균키는 165.7입니다
	}

}
