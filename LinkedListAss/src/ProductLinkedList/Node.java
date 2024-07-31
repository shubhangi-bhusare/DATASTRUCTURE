package ProductLinkedList;

public class Node {
	private Product pdt;
	private Node next;
	
	
	public Node( Product pdt) {
		this.pdt=pdt;
		next=null;
		
	}

	public Product getPdt() {
		return pdt;
	}


	public void setPdt(Product pdt) {
		this.pdt = pdt;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
