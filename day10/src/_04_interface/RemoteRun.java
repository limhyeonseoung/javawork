package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		// 인터페이스는 객체생성할 수 없다
		// 형변환은 가능
		
		// RemoteControl rc1 = new RemoteControl();
		Audio a1 = new Audio();
		a1.turnOn();
		a1.setVolume(50);
		a1.setVolume(150);
		System.out.println("--------------------");
		
		
		RemoteControl rc1 = a1;
		rc1.turnOn();
		rc1.setVolume(120);
		rc1.setVolume(-150);
		rc1.turnOff();
		
		
		System.out.println("--------------------");
		rc1 = new Tv();
		rc1.turnOn();
		rc1.turnOff();

	}

}
