package _02_abstract;

public class Frog extends Pet{
	Frog(){
		this ("청개구리","초록색","징그러움");
	}
	Frog(String kind,String color,String feature){
		super(kind,color,feature);		
	}
	@Override
	void sound() {
		System.out.println("개굴");
	}
	@Override
	void feature() {
		System.out.println("징그러움");	
	}
	@Override
	void info() {
	    System.out.println("종류 :" + super.getKind());
	}


}
