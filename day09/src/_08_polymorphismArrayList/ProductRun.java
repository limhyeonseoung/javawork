package _08_polymorphismArrayList;

public class ProductRun {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		gameDevice game = new gameDevice();		
		
		b.buy(tv);
		b.buy(com);
		b.buy(game);
		b.info();
		
		b.refund(tv);
		b.info();
		

	}

}
