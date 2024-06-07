package _01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T02_HashSet {

	public static void main(String[] args) {
		Object[] objArr = {"1",Integer.valueOf(1),"2","2","2","3","3","4","4","4"};
		Set set1 = new HashSet();
		
		set1.add(objArr[0]);
		set1.add(objArr[2]);
		set1.add(objArr[3]);
		
		for(Object obj : objArr) {
			set1.add(obj);
		}
		System.out.println(set1);
		
		set1.clear();
		System.out.println("객체의 갯수 : " + set1.size());
	
		
		//iteratorPrint(set1.Iterator());
	}

	private static void iteratorPrint(Iterator iterator) {
		// TODO Auto-generated method stub
		
	}
	
	

}
