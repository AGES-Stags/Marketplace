
public class ProductList {
	private static ProductList list;

	private Node head;
	private Node tail;
	private int size;
	

	private class Node {
		Product product;
		Node next;
		Node previous;

		public Node(Product product) {
			this.product = product;
		}

	}

	private ProductList() {
		head = tail = null;
		size = 0;
	}

	public static ProductList getInstance(){
		if(list == null) list = new ProductList();
		return list;
	}

	public void add(Product product) {
		Node node = new Node(product);

		if(head == null) {
			head = tail = node;
			size++;
			return;
		}

		tail.next = node;
		node.previous = tail;
		tail = node;
		size++;
	}

	public void addProductInIndex(Product product, int index){
		Node guarda;
		Node aux = new Node(product);

		guarda = head;
			for(int i=0; i<index; i++){
				guarda = guarda.next;
			}
				aux = guarda;
				aux.previous = guarda.next;
				aux.next = guarda.previous;	
				size++;
			}

	public void addFirst(Product product){//Giselle
		Node aux = new Node(product);

		if(head == null) {
			head = tail = aux;
			size++;
			return;
		}
				aux.next = head;
				head.previous = aux;
				head = aux;
				size++;
			}

	public void addLast(Product product){//Giselle
		Node aux = new Node(product);

		if(head == null) {
			head = tail = aux;
			size++;
			return;
		}
		for(int i=0; i<size; i++){
			if(i == size){
			aux.previous = tail;
			tail.next = aux;
			tail = aux;
			}
		}
	}

	public Product getIndex(int index) {
		Node node = head;

		for(int i = 0; i < index; i ++) {
			node = node.next;
		}

		return node.product;
	}


	public Product getIndexReverse(int index) {
		Node node = head;
			// TODO
		return node.product;
	}

	/*
	 * return an array containing all of the elements; 
	 */
	public Product[] toArray(){
		

		return 
	}

	@Override
	public String toString(){
		return "";
	}
}