package T01_Car;

public class Sedan implements Car1{

	@Override
	public void drive() {
		System.out.println("drive");
		
	}

	@Override
	public void turnLeft() {
System.out.println("좌회전");
		
	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
		
	}

	@Override
	public void stop() {
		System.out.println("정지");
		
	}

	

}
