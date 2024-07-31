package LinkedList.Assingment;

public class LinkedListAssignment {
	private Node head;
	
	public LinkedListAssignment() {
		head=null;
	}
	public boolean insert(int data) {
		Node tem=head;
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return true;
		}
		while(tem.getNext()!=null) 
		{
			tem=tem.getNext();
		}
		tem.setNext(newnode);
		return true;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	
	public void maxElement() {

		Node temp=head;
		int max=temp.getData();
		while(temp!=null) {
			if(temp.getData()>max) {
				max=temp.getData();
			}
			temp=temp.getNext();
			
		}
		System.out.println(max);
		
	}
	
	
	public void minElement() {
		Node temp=head;
		int min=temp.getData();
		while(temp.getNext()!=null) 
		{
			if(temp.getData()<min)
			{
				min=temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println(min);
	}
	
	public void EvenElement() {
		Node temp=head;
		while(temp!=null)
		{
			if(temp.getData()%2==0)
			{
				System.out.println(temp.getData());
			}
			temp=temp.getNext();
		}
	}
	
	
	public void sumOfEvenElem() {
		Node temp=head;
		int sum=0;
		while(temp!=null)
		{
			if(temp.getData()%2==0) {
				sum=sum+temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println(sum);
	}

}
