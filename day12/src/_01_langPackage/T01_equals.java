package _01_langPackage;

public class T01_equals {
	int Value;
	T01_equals(int value){
		this.Value = value;
	}
	
public class T01_equlas{
	public static void main(String[] args) {
		T01_equals v1 = new T01_equals(10);
		T01_equals v2 = new T01_equals(10);
		
		if(v1.equals(v2))
			System.out.println("v1과v2가 같다");
		else
			System.out.println("v1과v2가 다르다");
		
		T01_equals v3 = v1;
		if(v1.equals(v3))
			System.out.println("v1과v3가 같다");
		else
			System.out.println("v1과v3가 다르다");
			
	}
	}

}
