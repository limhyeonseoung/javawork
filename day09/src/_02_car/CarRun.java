package _02_car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar sCar1 = new AmbulanceCar("소나타","현대");
		System.out.println("모델명 : " + sCar1.model);
		System.out.println("회사명 : " + sCar1.company);
		
		sCar1.power();
		sCar1.speedUp();
		sCar1.siren();
		sCar1.speedDown();
		sCar1.firstAid();
		sCar1.speedUp();
		sCar1.speedDown();
		sCar1.siren();
		sCar1.power();
	}

}
