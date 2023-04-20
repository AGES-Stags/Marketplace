package marketplace.services;

import devtools.inject.Mockup;
import marketplace.entities.Product;

public class Market {

	static {
		Mockup.products((Class<?>) ProductList.class, (Class<?>) Product.class);
	}

	public static void run() {

	}

}
