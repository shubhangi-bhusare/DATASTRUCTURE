package CircularLinkedList;


public class CircularLinkedList {
	private Node head;
	
	public CircularLinkedList() {
		head=null;
	}
	public boolean Insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			newNode.setNext(newNode);
			return true;
		}
		Node last=head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head);//extra step as compare to singly LL But mandatory to maintain the axiom of Circ LL
		return true;
	}
	
	public boolean insertByPosition(int data,int pos) {
		Node newNode=new Node(data);
		if(pos<=0||(head==null && pos>1)) {
			return false;
		}
		if(pos==1) {
			if(head==null) {
				head=newNode;
				newNode.setNext(head);
				return true;
			}
		Node last=head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		newNode.setNext(head);
		head=newNode;//Mandatory step
		last.setNext(head);

		return true;
		}
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			temp=temp.getNext();
			
			if(temp==head) {
				System.out.println("Invalid Position!!!");
				return false;
			}
		}
		
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return true;
	}
	
	public boolean DeleteByVal(int data) {
		//If Delete on first position
		Node last=head;
		
		if(last.getData()==data) {
			while(last.getNext()!=head) {
				
				last=last.getNext();
			}
			head=head.getNext();
			last.setNext(head);
		}
		//If delete other than first position
		Node del=head;
		Node prev=head;
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
			if(del==head) {
				return false;
			}
		}
		prev.setNext(del.getNext());
	
		return true;
		
	}
	public boolean DeleteByPos(int pos) {
		Node last=head;
		if(pos==1) {
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			head=head.getNext();
			last.setNext(head);
			return true;
		}
		
		Node del=head;
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
		}
		del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
		
	}
	public void findmid() {
		Node temp=head;
		int count=0;
		do {
			count++;
			temp=temp.getNext();
		}while(temp!=null);
		System.out.println("Count is: "+count);
		Node mid=head;
		for(int i=0;i<count/2;i++) {
			mid=mid.getNext();
		}
		System.out.println("Mid element is: "+mid);
	}
	
	public void FindmiddleElement() {
		Node temp=head;
		int count=0;
		int middle=0;
		do {
			temp=temp.getNext();
			count++;
		}while(temp!=head);
		System.out.println("Coun is :"+count);
		Node prev=head;
		if(count%2==0) {
			System.out.println("Even length of list !!");
			return;
		}
		
		for(int i=1;i<=(count-1)/2;i++) {
			prev=prev.getNext();
		}
		
		System.out.println("middle element is: "+prev.getData());
	}
	public void sorting() {
		Node t1=head;
		Node t2=t1.getNext();
		int count=0;
		do {
			count++;
			t1=t1.getNext();
		}while(t1!=head);
		System.out.println("count is :"+count);
		for(int i=1;i<count;i++) {
			t1=head;
			t2=t1.getNext();
			while(t2!=head) {
				if(t1.getData()>t2.getData()) {
					int temp=t1.getData();
					t1.setData(t2.getData());
					t2.setData(temp);
				}
				
				
				t2=t2.getNext();
			}
			t1=t1.getNext();
		}
		System.out.println("Sorting in Ascending order is: ");
		Node show=head;
		while(show!=head) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}
	}
	
	public void Display() {
		System.out.println("Elements are:");
		Node temp=head;
		do{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp!=head) ;
	}
	
	
	
	
	/////=========================================REVISION======================================
	public boolean insertdata(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
			
		}
		if(head==null) {
			head=newNode;
			head.setNext(head);
			return true;
		}
		Node last=head;
		while(last.getNext()!=head) {
			last=last.getNext();
//			if(last==null) {
//				return false;
//			}
		}
		last.setNext(newNode);
		newNode.setNext(head);
		return true;
	}
	
	public boolean insertbypos(int pos,int data) {
		Node newNode = new Node(data);
		if(pos<=0 || (head==null && pos>1)) {
			return false;
		}
		if(pos==1) {
			if(head==null) {
				head=newNode;
				newNode.setNext(head);
				return true;
			}
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			newNode.setNext(head);
			head=newNode;
			last.setNext(head);
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
	
	public boolean Deletebyvalue(int data) {
		if(head==null) {
			return false;
		}
		if(head.getData()==data) {
			head=head.getNext();
			return true;
		}
		Node del=head;
		Node prev=head;
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
		}
		Node nextNode=del.getNext();		
		prev.setNext(nextNode);
		
		return true;
		
	}
	public boolean deletebyposition(int pos) {
		if (head == null || pos <= 0) {
            return false;
        }
		if(head==null) {
			return false;
		}

		if(pos==1) {
				if(head.getNext()==head) {//If only one node is present in the list
				head=null;
				return true;
			}
		Node las=head;
		while(las.getNext()!=head) {
			las=las.getNext();
		}
		
		head=head.getNext();//if on position one with list is not empty
		las.setNext(head);
		return true;
		}
		Node  prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==head) {
				return false;
			}
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
		
		
	}
	public void displayrev() {
		Node temp=head;
		do {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp!=head);
	}
}
