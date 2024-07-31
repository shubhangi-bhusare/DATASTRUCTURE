package SinglyLinkedList;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head=null;
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		if(head.getData()==data) {
			return false;
		}
		Node temp=head;
		

		while(temp.getNext()!=null) 
		{
			temp=temp.getNext();
			if(temp.getData()==data) {//condition for checking duplicates..it avoid duplicates 
//				//it is not mandatory but as per our need we can modify it

				return false;
			}
		}
		temp.setNext(newNode);
		return true;
		
	}
	public boolean InsertByPosition(int pos,int data) {
		Node newNode=new Node(data);
		if(pos<=0 || head==null && pos>1) {
			return false;
		}
		
		if(pos==1) {
			if(head==null) {
				head=newNode;
				return true;
			}
			if(head.getData()==data) {
				return false;
			}
		newNode.setNext(head);
		head=newNode;
		return true;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
		
	}
	
	public void Display() {
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	//3rd way-->Reverse by shifting nodes 
	public void reverse() {
		if(head==null||head.getNext()==null) {
			return;
		}
		Node n1=head;
		Node n2=head.getNext();
		while(n2!=null) {
			Node n3=n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;
		}
		head.setNext(null);
		head=n1;
	}
	public boolean deletebyvalue(int data) {
		if(head==null) {//if list is empty
			return false;
		}
		if(head.getData()==data) {//if position is 1
			head=head.getNext();
			return true;
		}
		Node temp=head;
		Node prev=head;
		while(temp.getData()!=data) {
			prev=temp;
			temp=temp.getNext();
			if(temp==null) {
				return false;
			}
		}
		prev.setNext(temp.getNext());
		return true;
		
	}
	
	public boolean DeleteByPosition(int pos) {
		if(head==null) {
			return false;
		}
		if(pos==1) {
			head=head.getNext();
			return true;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==null) {
				return false;
			}
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
		
	}
	public boolean deleteByVal(int data) {
		//if head is null means list is empty
		if(head==null) {
			return false;
		}
		
		//Delete first...if list contain only one node still it work
		if(head.getData()==data) {
			head=head.getNext();
			return true;
		}
		Node prev=head, del=head;
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
			
		}
		prev.setNext(del.getNext());
		return true;
	}
	
	public boolean deletebyPos(int position) {
		if(head==null) {
			return false;
		}
		Node prev=head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==null) {
				return false;
			}
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		
		return true;
		
	}
		
}
