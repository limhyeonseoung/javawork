package _03_abstract;

public class FolderPhone extends Phone {

	FolderPhone(String owner) {
		super(owner);
	}

	@Override
	void turnOn() {
		System.out.println("폴더를 연다");
	}

	@Override
	void turnOff() {
		System.out.println("폴더를 닫는다");
	}
	void user() {
		System.out.println("사용자 + " + owner);
	}

}
