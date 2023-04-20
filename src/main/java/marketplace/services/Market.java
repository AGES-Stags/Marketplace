package marketplace.services;

import marketplace.entities.Product;

import devtools.inject.Mockup;

public class Market {

	static {
		Mockup.products((Class<?>) ProductList.class, (Class<?>) Product.class);
	}

	public static void run() {
		Product product = new Product("Geladeira",1000,"2 Portas");
		Product product2 = new Product("Sofá", 670, "3 Lugares");
		Product product3 = new Product("Mesa", 780, "6 Lugares");
		Product product4 = new Product("Tábua", 7, "Madeira");
		Product product5 = new Product("Roupeiro", 760, "MDF");
		ProductList productList = ProductList.getInstance();
		
		productList.add(product);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
	
		//productList.addProductInIndex(product5, 3);
		productList.addFirst(product5);
		productList.toString();
	}

}
