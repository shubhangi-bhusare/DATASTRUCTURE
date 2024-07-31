package CircularLinkedList;

public class CircularLinkedList {
	private Node head;
	
	public CircularLinkedList() {
		head=null;
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			head.setNext(head);//if list is empty then we need to assign head to newnode then put head ref into head i.e newnode
		}
		Node last=head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		last.setNext(newNode);//here first set newnode wih last means in last put newnode reference
		newNode.setNext(head);//then in newnode put head reference 
		return true;
		
		
	
	}
	public void Display() {
		Node temp=head;
//		while(temp.getNext()!=head)
//		{
//			System.out.print(temp.getData()+" ");  //if we write this while loop then it will skip the last element during display so we need do while loop
//			temp=temp.getNext();
//		}
		do {			
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
			
		}while(temp!=head);
	}
	
	//insert on particular position
	public boolean InsertByPos(int data,int pos) {
		Node newNode=new Node(data);
		if(pos==1) {
			if(head==null) {
				head=newNode;
				head.setNext(head);
				return true;			
			}
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			
			newNode.setNext(head);
			head=newNode;
			last.setNext(newNode);
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==head) {//if we not apply this condition then Cir LL goes in loop and it will insert element at invalid position
				//to avoid that insertion we need this condition-->  apply this condition mandatory
				return false;
			}
		}
		
		newNode.setNext(prev.getNext());//in newnode put prev.getnext element reference
		prev.setNext(newNode);//in prev put newnode reference
		return true;
		
	}
	//delete by value
	public boolean DeleteByVal(int data) 
	{
		if(head==null) 
		{
			return false;
		}
		Node del=head;
		Node prev= head;
		while(del.getData()!=data)//loop iterate till condition is true and stop when it get false
			//if we got data then loop will need to stop
		{
			prev=del;
			del=del.getNext();
			if(del==head) {
				return false;
			}
		}
		
		prev.setNext(del.getNext());
		
		return true;
		
	}
	
	public boolean DeleteByPosition(int position) 
	{
		if(head==null || position<=0) 
		{
			return false;
		}
		Node prev=head, del=head;
		for(int i=0;i<position-1;i++) 
		{
			prev=prev.getNext();
			if(prev==head) {
				return false;
			}
			
		}
		del=prev.getNext();
		prev.setNext(del.getNext());
		return false;
		
	}

}
