
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

	public Product getIndex(int index) {
		Node node = head;

		for(int i = 0; i < index; i ++) {
			node = node.next;
		}

		return node.product;
	}


	public Product getIndexReverse(int index) {
		Node node = head;
			while(node.next!=null){
				if(getIndex(index).equals(node.product));
			}
		return node.product;
	}

	public void addFirst(Product product) { 
		Node node = new Node(product);
		if(head == null) {
            head = tail = node;
			size++;
			return;
		}
		node.next = head;
		head.previous = node;
		head = node; 
		size++; 
	}

	public void addLast(Product product) { 
		Node node = new Node(product);
		if(head == null) {
            head = tail = node;
			size++;
			return;
		}
		node.previous = tail;
		tail.next = node;
		tail = node; 
		size++; 
	}
	public void addFirstAndLast(Node node1, Node node2) {
		addFirst(node1.product);
		addLast(node2.product);
	}
	
	public boolean contains(Product product) {
		Node node = head;
		while (node != null) {
			if (node.product.equals(product)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "";
	}
}