package _03_lsp;


class Cat{
	void speak() {
		System.out.println("야옹");
	}
	
}
class WhiteCat extends Cat{
	String color = "white";
}
class BlackCat extends Cat{
	String color = "Black";
}
public class CatRun {

	public static void main(String[] args) {
		Cat cat = new WhiteCat();
		cat.speak();
		WhiteCat whiteCat = (WhiteCat)cat;
		whiteCat.speak();
		
		Cat cat2 = new BlackCat();
		cat2.speak();
		BlackCat blackCat = (BlackCat)cat;
		blackCat.speak();
		

	}

}
