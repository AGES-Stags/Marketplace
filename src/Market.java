
import inject.*;

public class Market {

	public static void run() {
		ProductList productList = ProductList.getInstance();
		productList
				.add(new Product("Kit pressostato", 119.98, "Pressostato, manometro e válvula de segurança 125 PSI"));

		Mockup.sout();

	}
}
