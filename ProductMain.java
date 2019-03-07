// client for Product object

public class ProductMain {

	public static void main(String[] args) {
	
		// create instances of 3 products
		Product charger = new Product(1, "Charger", 5.99, 4);
		Product earpods = new Product(2, "Earpods", 4.99, 3);
		Product remote = new Product(3, "Remote", 2.99, 2);
		
		// display product info
		System.out.println(charger.toString());		
		System.out.println();
		System.out.println(earpods.toString());
		System.out.println();
		System.out.println(remote.toString());
		System.out.println();
		
		// show number of products
		System.out.println("Products available: " + Product.getCount());
		
	}
}
