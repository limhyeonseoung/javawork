package _02_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class T06_classCast {

	public static void main(String[] args) {
		try {
		Animal ani = new Animal();	
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal aniDog = dog;
		Animal aniCat = cat;
		
		dog = (Dog)aniDog;
		dog = (Dog)ani;  // 예외발생
		}catch(ClassCastException e) {
			System.out.println("부모타입을 자식타입으로 형변화할 수 없음");
		}

	}

}
