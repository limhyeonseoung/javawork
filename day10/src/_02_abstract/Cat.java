package _02_abstract;

public class Cat extends Pet{
	Cat(){
		super ("페르시안","하얀색","밥을좋아함");
	}
	Cat(String kind,String color,String feature){
		super(kind,color,feature);		
	}
	@Override
	void sound() {
		System.out.println("야용");
	}
	@Override
	void feature() {
		System.out.println("밥을좋아함");	
	}
	@Override
	void info() {
		
		
	}

}
