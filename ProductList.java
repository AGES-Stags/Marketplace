import java.util.Arrays;

public class ProductList {
	private static ProductList list;
	private Product[] productList;
	private int i=0;
	
	private ProductList(){
		productList = new Product[3];
	}

	public static ProductList getInstance(){
		if(list == null) list = new ProductList();
		return list;
	} 

	public void addProduct(Product product){
		if(productList.length <= i ){
			Product[] array = new Product[i*2];
			for(int i=0; i<productList.length;i++){
				array[i] = productList[i];
			}
			productList = array;
		}
		productList[i] = product;
		++i;
	}

	@Override
	public String toString(){
		return Arrays.toString(productList);
	}
}