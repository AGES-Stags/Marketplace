public class Market {

	public static void run(){
		Product product = new Product("Geladeira",1000,"2 Portas");
		Product product2 = new Product("Sofá", 670, "3 Lugares");
		Product product3 = new Product("Mesa", 780, "6 Lugares");
		Product product4 = new Product("Tábua", 7, "Madeira");
		ProductList productList = ProductList.getInstance();
		productList.addProduct(product);
		productList.addProduct(product2);
		productList.addProduct(product3);
		productList.addProduct(product4);

		System.out.println(productList.toString());
		System.out.println(Product.getCountInstances());
		System.out.println(Product.countInstances);
	}   
}
