package _02_comparable;

import java.util.*;

public class T03_FruitComparator {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitDescending());
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("오렌지",1500));
		treeSet.add(new Fruit("사과",1000));
		treeSet.add(new Fruit("멜론",8000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
