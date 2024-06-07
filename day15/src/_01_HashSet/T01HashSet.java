package _01_HashSet;

import java.util.*;

class ClassA{
	String str;
	
	public ClassA() {}
	public ClassA(String str) {
		this.str = str;
	}
}

public class T01HashSet {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		ClassA ca1 = new ClassA("java");
		set2.add(ca1);
		set2.add(new ClassA("oracle"));
		set2.add(new ClassA("sql"));
		set2.add(new ClassA("react"));
		set2.add(new ClassA("jsp"));
		
		int size = set2.size();
		System.out.println("저장된 객체의 갯수 : " + size);
		
		/*
		Iterator<ClassA> i = set2.iterator();
		while(i.hasNext()) {
			ClassA ca = i.next();
			System.out.print(ca.str + " ");			
		}
		System.out.println();
		*/		
		// 출력시 계속 호출이 되도록 메소드로 구현
		iteratorPint(set2.iterator());
		
		set2.add(new ClassA("aws"));
		iteratorPint(set2.iterator());
		
		// 삭제 : orcale
		Iterator<ClassA> i = set2.iterator();
		while(i.hasNext()) {
			ClassA ca = i.next();
			if(ca.str.equals("oracle"))
				i.remove();
		}
		iteratorPint(set2.iterator());

	}
	
	static void iteratorPint(Iterator<ClassA> i) {
		while(i.hasNext()) {
			ClassA ca = i.next();
			System.out.print(ca.str + " ");			
		}
		System.out.println();	
	}

}
