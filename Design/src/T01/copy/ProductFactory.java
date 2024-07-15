package T01.copy;

public class ProductFactory {
	
	public static Product getInstance(String name) {
		Product product = new Product();
		if(name.equalsIgnoreCase("tv")) {
			product.setName("TV");
			product.setPrice(300);
		}else if(name.equalsIgnoreCase("computer")){
			product.setName("Computer");
			product.setPrice(200);
		}
		return product;
	}

}
