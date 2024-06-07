package _02_car;

public class AmbulanceCar extends Car {

	boolean siren;
	String firstAid;
	
	AmbulanceCar(String model, String company){
		super(model, company);
	}
	
    void siren(){
    	if(siren = ! siren)
    		System.out.println("사이렌을 킵니다");
    	else
    		System.out.println("사이렌을 끕니다");

    }
    	
    void firstAid() {
    	System.out.println("응급처리를 합니다");   
    }						
}
