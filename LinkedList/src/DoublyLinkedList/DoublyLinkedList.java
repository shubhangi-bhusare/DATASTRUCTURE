package DoublyLinkedList;

public class DoublyLinkedList {
	private Node head;
	
	//Default Constructor
	public DoublyLinkedList() {
		head=null;
	}
	
	
	public boolean insert(int data){
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		if(head==null) 
		{
			head=newNode;
			return true;
		}
		Node last=head;
		//locate the last node at last
		while(last.getNext()!=null) 
		{
			last=last.getNext();
		}
		//when we go to last set the newnode with last
		last.setNext(newNode);
		newNode.setPrev(last);
		
		return true;
		
	}
	
	//Insert at particular position
	public boolean InsertAtPosition(int data,int position) {
		if(position<=0 || (head==null&&position>1))
		{
			return false;
		}
		
		Node newNode=new Node(data);
		if(position==1) 
		{
			if(head!=null) {
				newNode.setPrev(head);
				head.setNext(newNode);
			}
			head=newNode;
			return true;
		}
		
		//locate the previous on the insert position less than 1
		Node prevNode=head;
		for(int i=1;i<position-1;i++) 
		{
			prevNode=prevNode.getNext();
			
		}
		Node nextNode=prevNode.getNext();
		
		
		newNode.setPrev(prevNode);
		if(nextNode!=null) {// if we insert on last position then this validation is needed
			newNode.setNext(nextNode);//otherwise it give nullpointerException if we try to insert on last position
			nextNode.setPrev(newNode);
		}
		prevNode.setNext(newNode);
		
		
		
		//prevNode.setNext(newNode);//we can insert on any position in any sequence 
		//below logic is also work only it will crash when we try to insert on last position 
		//below we can insert by any sequence
//		prevNode.setNext(newNode);
//		nextNode.setPrev(newNode);
//		newNode.setNext(nextNode);
//		newNode.setPrev(prevNode);
		return true;

	}
	
	
	
	//DELETION IN DOUBLY LINKEDLIST
	public boolean DeleteByVal(int data) {
		Node del=head;

		if(head==null) {
			return false;
		}
		//if user Give first Position data element which is head element
		if(head.getData()==data) 
		{
			head=head.getNext();//here we set the head at next element
			head.setPrev(null);//here we set the next element previos as null means it become head when we delete positon 1 element
			return true;
		}
		//If user give in between position
		while(del.getData()!=data) 
		{
			del=del.getNext();	
			if(del==null) {
				return false;
			}
		}
		Node prevNode=del.getPrev();
		Node nexNode=del.getNext();
		
		prevNode.setNext(nexNode);
//		if(nexNode!=null) {
//			nexNode.setPrev(prevNode);
//			return true;
//		}
//		
		
		return true;
		
	}
	
	public boolean DeleteByPos(int pos) 
	{
		//if user give first position to delete
		if(pos==1) 
		{
			head=head.getNext();
			head.setPrev(null);
		}
				
		//delete when user give particular position
		Node prev=head;
		for(int i=1;i<pos-1;i++) 
		{
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
			
		}
		Node del=prev.getNext();
		Node nextNode=del.getNext();
		prev.setNext(nextNode);//this condition will delete the connection but at last node it is node applicable so we need below condition
		
//		if(nextNode!=null) //here if last node is not there
//		{
//		nextNode.setPrev(prev);
//		return true;
//		}
		return true;
	}
	
	
	public void Display() 
	{
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}

}
