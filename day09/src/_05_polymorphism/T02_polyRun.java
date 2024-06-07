package _05_polymorphism;

class parent{
	void method1() {
		System.out.println("Parent method1()");
	}
    void method2(){
		System.out.println("Parent method2()");
	}
}

class Child extends parent{
	@Override
	void method2() {
		System.out.println("child method2()");
	}
	void method3() {
		System.out.println("child method3()");
	}
}

public class T02_polyRun {

	public static void main(String[] args) {
		Child child = new Child();
		parent parent2 = new Child();
		parent2.method1();
		// 오버라이딩한 메소드는 형변환과 상관없이 무조건 객체를 생성한 곳에 들어있는 메소드를 호출
		parent2.method2();
	}


}
