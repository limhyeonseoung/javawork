package _05_singleton;

public class T01_main_singleton {

	public static void main(String[] args) {
		//객체 생성 불가
		//T01_api_singleton s1 = new T01_api_singleton();
		
		T01_api_singleton singleton1 = T01_api_singleton.getsingle();
		T01_api_singleton singleton2 = T01_api_singleton.getsingle();
		T01_api_singleton singleton3 = T01_api_singleton.getsingle();
		T01_api_singleton singleton4 = T01_api_singleton.getsingle();
		
		if(singleton1 == singleton2)
			System.out.println("같은 객체");
		else
			System.out.println("다른 객체");
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);


	}

}
