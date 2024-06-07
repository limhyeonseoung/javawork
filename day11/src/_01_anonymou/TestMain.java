package _01_anonymou;

class Parent{
	String method() {
		return"부모의 재산";
	}
}
class Child extends Parent{
	@Override
	String method() {
		return"자식의 재산";
	}
}

public class TestMain {
	public static void main(String[] args) {	
	Parent p= new Child();
	System.out.println(p.method());
	
	//익명 클래스 : 재사용할 필요가 없을 때 1번만 정의하여 사용
	Parent p2= new Child() {
		@Override
		String method() {
			return "다내꺼";
	}
	 };
	 System.out.println(p2.method());
	
  }	
}
