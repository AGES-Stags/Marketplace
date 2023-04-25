package marketplace.services;

import marketplace.entities.Product;

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
	/*
	 * Metod clear all the products of the node;
	 */
	public void clear(){
		head = head.next;
		for(Node node=head; node != null; node=node.next){
			head.previous.product = null;
			head.next = null;
			head.previous = null;			
		}
		head = tail = null;
		size = 0;
	}

	public Product[] clone(){
		if(head != ){}

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
		Product[] array = new Product[size];
		Node node = head;

		for (int i = 0; i < size; i++) {
			array[i] = node.product;
			node = node.next;
		}

		return array;
	}


	
	public void SwapByindex(int index,int ind){
		Node aux = head;
		Node aux1 = head;
		int maior=0;
		Node guarda;
		int menor =0;
        
		if(index > ind){
			maior = index;
			menor = ind;
		}
		else{
			maior = ind;
			menor = index;
		}
		for(int i = 0; i < maior; i++){
			if(i < menor){
			aux = aux.next;
		    }
			aux1 = aux1.next;
		}
		
		aux1.next.previous = aux;
		aux1.previous.next = aux;
		aux.next.previous = aux1;
		aux.previous.next = aux1;
        
		guarda = aux.next;
		aux.next = aux1.next;
		aux1.next = guarda;
		guarda = aux.previous;
		aux.previous = aux1.previous;
		aux1.previous = guarda;
	}
    public void removeByIndex(int index){
		if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }    
		if(head == null) {
           return;
		}
		Node aux = head;
		for(int i=0 ; i<index ; i++){
			aux = aux.next;
		}
		aux.next.previous = aux.previous;
		aux.previous.next = aux.next;
		size--;
	}
	public void removeByelement(Product product){
		Node aux = head;
        while(aux.next!= null){
			aux = aux.next;
            if(aux.product.equals(product)){
                aux.next.previous = aux.previous;
                aux.previous.next = aux.next;
                size--;
                return;
            }
        }
	}
	public void clear(){
		Node aux=head;
		while(aux.next!=null){
			aux = aux.next;
			head.next=null;
			head=aux;
			aux.previous=null;
		}
		tail=null;
		head=null;
		aux=null;
	} 
	

	@Override
	public String toString(){
		return "";
	}
}