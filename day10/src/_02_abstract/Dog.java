package _02_abstract;

public class Dog extends Pet{
	Dog(){
		super ("리트리버","노란색","산책을 좋아함");
	}
	Dog(String kind,String color,String feature){
		super(kind,color,feature);
		
	}
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	@Override
	void feature() {
		System.out.println("산책을 좋아함");	
	}
	@Override
	void info() {
	    System.out.println("색깔 :" + super.getColor());
	}

}
