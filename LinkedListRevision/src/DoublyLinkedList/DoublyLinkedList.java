package DoublyLinkedList;

public class DoublyLinkedList {
	private Node head;
	public DoublyLinkedList() {
		head=null;
	}
	public boolean Insert(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node last=head;
		
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
	
		return true;
		
	}
	public boolean InsertByPos(int data,int pos) {
		Node newNode = new Node(data);
		if(pos==1) {
			if(head==null) {
				head=newNode;
				return true;
			}
			
				newNode.setNext(head);
				head=newNode;
				head.setPrev(newNode);
				return true;
		}
		
		Node prevNode=head;
		for(int i=1;i<pos-1;i++) {
			prevNode=prevNode.getNext();
		}
		Node nextNode=prevNode.getNext();
		newNode.setPrev(prevNode);
		if(nextNode!=null) {
			newNode.setNext(nextNode);
			nextNode.setPrev(newNode);
		}
		prevNode.setNext(newNode);
		return true;
		
	}
	public boolean DeleteByVal(int data) {
		Node temp=head;
		
		if(head.getData()==data) {
			head=head.getNext();
			head.setPrev(null);
			return true;
		}
		Node del=head;
		while(del.getData()!=data) {
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		Node prevNode=del.getPrev();
		Node NexNode=del.getNext();
		prevNode.setNext(NexNode);
		if(NexNode!=null) {
		NexNode.setPrev(prevNode);
		}
		return true;
		
	}
	public boolean DeleteByPos(int pos) {
		if(pos==1) {
			if(head==null) {
				return false;
			}
			head=head.getNext();
			head.setPrev(null);
			return true;
		}
		Node del=head;
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
		}
		del=prev.getNext();
		Node NextNode=del.getNext();
		prev.setNext(NextNode);
		if(NextNode!=null) {
		NextNode.setPrev(prev);
		}
		return true;
		
	}
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
//==================================REVISION=======================================
	public boolean insertt(int data) {
		Node newNode =new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		
		newNode.setPrev(temp);
		temp.setNext(newNode);
		return true;
		
	}
	public boolean insertbyposition(int pos,int data) {
		Node newNode=new Node(data);
		
		if(pos==1) {
			if(head==null) {
				head=newNode;
				return true;
			}
			
				newNode.setNext(head);
//				head=newNode;
				head.setPrev(newNode);
			return true;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
		}
		Node nextNode=prev.getNext();
		newNode.setPrev(prev);
		if(nextNode!=null) {
			newNode.setNext(nextNode);
			nextNode.setPrev(newNode);
			
		}
		prev.setNext(newNode);
		
		return true;
		
	}
	public boolean deletebyvalue(int data) {
		if(head==null) {
			return false;
		}
		if(head.getData()==data) {
			head=head.getNext();
			head.setPrev(null);
			return true;
		}
		Node del=head;

		while(del.getData()!=data) {
			
			del=del.getNext();
		}
		Node nextNode=del.getNext();
		Node prevNode=del.getPrev();
		prevNode.setNext(nextNode);
		if(nextNode!=null) {
		nextNode.setPrev(prevNode);
		}
		
		return true;
		
	}
	public boolean DeleteByPosition(int pos){
		if(pos<=0 || (head==null && pos >1)) {
			return false;
		}
		if(pos==1) {
			if(head==null) {
				return false;
			}
			head=head.getNext();
			head.setPrev(null);
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			
			prev=prev.getNext();
		}
		Node del=prev.getNext();
		Node nexNode=del.getNext();
		prev.setNext(nexNode);
		if(nexNode!=null) {
			nexNode.setPrev(prev);
		}
		return true;
		
	}
	public void displayy() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
