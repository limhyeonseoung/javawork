package _04_ex01;

public class T01_main_book {

	public static void main(String[] args) {
	T01_api_book bk1 = new T01_api_book("python");
	T01_api_book bk2 = new T01_api_book("springBoot",98241);
	T01_api_book bk3 = new T01_api_book();
	T01_api_book bk4 = new T01_api_book("toopt",153,27000);
	
	System.out.println("bk1 : "+ bk1.bookName);
	
	System.out.println("bk2 : "+ bk2.bookName);
	System.out.println("bk2 : "+ bk2.ISBN);
	
	System.out.println("bk3 : "+ bk3.bookName);
	System.out.println("bk3 : "+ bk3.ISBN);
	

	}

}
