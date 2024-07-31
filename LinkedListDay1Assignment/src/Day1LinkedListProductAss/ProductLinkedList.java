package Day1LinkedListProductAss;

public class ProductLinkedList {
	private Node head;
	public ProductLinkedList() {
		head=null;
	}
	
	public boolean InsertProduct(Product prod) {
		Node newNode=new Node(prod);
		if(head==null) {
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
		
	}
	public void DisplayProduct() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.getPdt()+ " ");
			temp=temp.getNext();
		}
		System.out.println();
	}
}
