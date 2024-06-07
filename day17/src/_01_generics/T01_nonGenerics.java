package _01_generics;

class Box{
	private Object object;
	void set(Object object) {
		this.object = object;
	}
	Object get() {
		return object;
	}
}

class Apple{}
public class T01_nonGenerics {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		
		box.set(new Apple());
		Apple a1 = (Apple)box.get();

	}

}
