package Book;

public class Apple {
	String name;
	int price;
	
	public Apple() {}
	public Apple(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	void showPrice(){
		System.out.println(name + "의 가격은" + price + "원 입니다");
	}


	
	



}
