package _02_car;

public class Car {
	String model;
	String company;
	boolean power;
	int speed;
	
	Car(String model, String company){
		this.model=model;
		this.company=company;
		
	}
	
	void power() {
		if(power = !power)
			System.out.println("시동을 킵니다");
		else
			System.out.println("시동을 끕니다");
	}
	void speedUp() {
		speed += 100;
		System.out.println(speed + "km만큼 속도를 냅니다");
		
	}
	void speedDown() {
		speed -= 100;
		System.out.println(speed + "km만큼 속도를 냅니다");
	}
	
					
	
	

}
