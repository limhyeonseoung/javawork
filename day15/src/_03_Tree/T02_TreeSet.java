package _03_Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
//		TreeSet ts = new TreeSet();
//		while(ts.size() < 6) {
//			ts.add((int)(Math.random()*45)+1);
//		}
//		System.out.println(ts);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇장 구매하십니까? : ");
		int num = sc.nextInt();
		TreeSet rotto = new TreeSet();
		
		for(int i=1;i<=num;i++) {
		rotto.clear();
			while(rotto.size() < 6) {
				rotto.add((int)(Math.random()*45)+1);
			}
			System.out.println(rotto);
		}
		
	
		

	}

}
