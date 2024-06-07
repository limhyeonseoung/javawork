package _01_polymorphosm;

public class PetRun {

	public static void main(String[] args) {
		Pet pet1 = new Frog("황소개구리","갈색","큼");
		pet1.info();
		System.out.println(pet1);
		pet1.sound();
		
		Pet pet2 = new Cat();
		pet2.info();
		pet2.sound();
     // pet2.color();   <- 오류 : 사용자여서
		
		Pet pet3 = new Cat("코숏","갈색","귀여움");
		pet3.info();
		pet3.sound();
		

		
		

	}

}
