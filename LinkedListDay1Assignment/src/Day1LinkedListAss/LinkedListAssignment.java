package Day1LinkedListAss;

import java.util.HashSet;

public class LinkedListAssignment {
	private Node head;
	public LinkedListAssignment() {
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
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
		
	}
	//Find max element from the list
	public void findMax() {
		Node temp=head;
		int max=temp.getData();
		while(temp!=null) {
			
			if(temp.getData()>max) {
				max=temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println("Max Element from the list is: "+max);
	}
	public void getmax() {
		Node temp=head;
		int max=temp.getData();
		while(temp!=null) {
			if(temp.getData()>max) {
				max=temp.getData();
			}
			temp=temp.getNext();
			
		}
		System.out.println("Max element is : "+max);
	}
	//Find min element from the list
	public void FindMin() {
		Node temp=head;
		int min=temp.getData();
		while(temp!=null) {
			if(temp.getData()<min) {
				min=temp.getData();
			}
			temp=temp.getNext();
			//System.out.println("Min Element from list is: "+min);
		}
		System.out.println("Min Element from list is: "+min);
	}
	
	//Find the sum of Even number
	public void FindEvenNoSum() {
		Node temp=head;
		int sum=0;
		while(temp!=null) {
			if(temp.getData()%2==0) {
				sum=sum+temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println("Sum of the Even Numbers is: "+sum);
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
	
	public void removeDuplicate() {
		HashSet<Integer> hs=new HashSet<Integer>();
		Node curr=head;
		Node prv=null;
		while(curr!=null) {
			int curval=curr.getData();
			if(hs.contains(curval)) {
				prv.setNext(curr.getNext());
			}else {
				hs.add(curval);
				prv=curr;
			}
			curr=curr.getNext();
		}
		Node show=head;
		while(show!=null) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}
		
				
	}
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}

}
