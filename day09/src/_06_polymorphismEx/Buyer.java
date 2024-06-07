package _06_polymorphismEx;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	/*
	void buy(Computer com) {

}
	void buy(Tv tv) {
		
	}
	*/
    void buy(Product p) {
    	if(money<p.price) {
    		System.out.println("잔액 부족");
    	    return;
    }
    money -= p.price;
    bonusPoint += p.bonusPoint;
    System.out.println(p + "를 구입함");
    }
}

