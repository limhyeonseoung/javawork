package _05_singleton;

// singleton : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
//           : 실행클래스에서 객체를 만들지 못하도록 해야함

public class T01_api_singleton {
	// 객체를 생성하지 못하도록 막아 놓았음
	private static T01_api_singleton single1 = new T01_api_singleton();
	
	
	private T01_api_singleton(){
		System.out.println("객체생성");
	}
	// 인스턴스 변수 => 정적변수로 바꾸어줌 ( + static ), 그래야 호출할 수 있음
	static T01_api_singleton getsingle() {
		return single1;  // 정적메소드에서는 정적필드만 사용가능 그래서 변수앞에 static붙어야됨
	}
	
	

}
