package Book;

public class Apple_main {

	public static void main(String[] args) {
		System.out.println("======== 사과 ========");
		 Apple a0 = new Apple("빨간사과",2100);
		 Apple a1 = new Apple("햇사과", 2000);
		 Apple a2 = new Apple("아오리사과", 1500);
		 
		 System.out.println(a2.name);
		 a2.showPrice();
		 a0.showPrice();
	}

}
