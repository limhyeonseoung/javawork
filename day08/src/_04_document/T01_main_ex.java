package _04_document;

class product{
	String serialNo;
	static int count;
	
	product(){
		serialNo = "더조은" + ++count;
	}
}
public class T01_main_ex {
	public static void main(String[] args) {
		product p1 =new product();
		product p2 =new product();
		product p3 =new product();
		
		System.out.println("p1의 제품 번호 : " + p1.serialNo);
		System.out.println("p2의 제품 번호 : " + p1.serialNo);
		System.out.println("p3의 제품 번호 : " + p1.serialNo);		
		System.out.println("총 제품의 갯수 : " + product.count);
	}


	
}
