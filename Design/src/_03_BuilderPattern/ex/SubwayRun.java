package _03_BuilderPattern.ex;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway(15,"화이트 블랫",null,null,true,"머스타드"); // 안넣을려면 null 
	System.out.println(menu1);
		
	Subway menu2 = new Subway(30,"플랫브레드");
	System.out.println(menu2);
		
		

	}

}
