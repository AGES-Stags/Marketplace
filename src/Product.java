public class Product{
	String name, description;	
	double price;

	public Product(String name, double price,String description){
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String toString(){
		return name;
	}

}