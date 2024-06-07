package _03_abstract;

public class PhoneRun {

	public static void main(String[] args) {
		Phone ph1 = new FolderPhone("임현승");		
		ph1.turnOn();
		ph1.turnOff();
		
		ph1 = new iPhone("이순신");
		ph1.turnOn();
		ph1.turnOff();
		
	

	}

}
