package ProductLinkedList;

public class LinkedList {
	private Node head;
	public LinkedList() {
		head=null;
	}
	
	public boolean insert(Product p) {
		Node newnode=new Node(p);
		
		if(head==null) {
			head=newnode;
			return true;	
		}
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(newnode);
		return false;
		
	}
	
	public void display() {
		Node temp=head;
		while(temp != null) 
		{
			System.out.println(temp.getPdt());
			temp=temp.getNext();
		}
	}

}
