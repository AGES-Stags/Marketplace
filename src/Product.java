public class Product{
	String name, description;	
	double price;
	private static int countInstances=0;

	public Product(String name, double price,String description){
		this.name = name;
		this.price = price;
		this.description = description;
		countInstances++;
	}

	public static int getCountInstances() {
		return countInstances;
	}

	public String toString(){
		return name;
	}
	
	}