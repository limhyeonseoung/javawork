package _02_wrapperClass;

public class T01_wrapper {

	public static void main(String[] args) {
		// deprecated : 앞으로 없어질 가능성이 있는 것. 되도력이면 쓰지마시오
		Integer iiii = new Integer(3);
		Integer i = Integer.valueOf(3);
		Integer i2 = Integer.valueOf(100);
		
		/*
		 * compare To()
		 * 0 : 비교해서 같으면 0
		 * 1 : 문자열의 사전순의 반대(숫자도 같음)
		 * -1 : 문자열의 사전순일대
		 */
		
		System.out.println(i.compareTo(i2));
		
		int result = i;
		String result2 = i.toString();
		System.out.println("result = " + (result+3));
		System.out.println("result = " + (result2+3));
		
		System.out.println("MIN VALUE : " + Integer.MIN_VALUE);
		System.out.println("MIN VALUE : " + Integer.MAX_VALUE);
		
		

	}

}
