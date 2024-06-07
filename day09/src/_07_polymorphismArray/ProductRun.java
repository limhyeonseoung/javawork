package _07_polymorphismArray;

public class ProductRun {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new gameDevice());
		System.out.println("현재 남은 돈" + b.money + "만원");
		System.out.println("보너스 점수" + b.bonusPoint + "점");
		b.info();
		b.buy(new Tv());
		

	}

}
