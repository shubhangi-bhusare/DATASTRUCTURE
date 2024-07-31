package LinkedList;

import java.util.Stack;

public class LinkedList {
	
	private Node head;
	
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public LinkedList() {
		head= null;
	}
	public boolean insert(int data) {
		Node newnode=new Node(data);
		if(newnode==null) {
			return false;
		}
		//insert at first position 
		if(head==null)
		{
			head=newnode;
			return true;
		}
		//insert at Last Position
		Node temp=head;
		while(temp.getNext()!=null) 
		{
			temp=temp.getNext();
		}
		//newnode.setNext(temp);
		temp.setNext(newnode);
	
		return true;
		
		//Insert at particular position
		
	}
	
	public boolean insertPos(int data,int pos) {
		Node temp=head;
		Node newNode=new Node(data);
		if(pos<0||(head==null&&pos>0)) {
			return false;
		}
		
		if(newNode==null) {
			return false;
		}
		
		if(pos==0) {
			newNode.setNext(head);
			newNode=head;
			return true;
		}
		//locate the previous node
		Node prev=head;
		for(int i=0;i<pos-1;i++)
		{
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return false;
		
	}
	
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	
	//Reverse the element
	//If we use head to traverse through list--> it is possible but as per the
	//axios(rule) of linkedlist we cant do that i.e we cant modify the original head
	//we need temp variable to create the copy of that head
	//means we cant modify that original head but we modify the copy of that head
	public void reverselist()
	{
		Stack<Node> stack=new Stack<>();
		Node temp=head;
		while(temp!=null)
		{
			stack.push(temp);
			temp=temp.getNext();
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop().getData()+" ");
		}
	}
	
	//Reverse by Recusrsion
	public void ReverseByRecursion(Node temp) 
	{
		
		if(temp==null) {
			System.out.println();
			return;
		}
		ReverseByRecursion(temp.getNext());
		System.out.print(temp.getData()+" ");
		
	}
	
	//Sorting of elements
	//NOT WORK-NULLPOINTEREXCEPTION
	public void sortList() {
		Node currentnode=head;
		int temp;
		int a=currentnode.getData();
		Node index1=currentnode.getNext();
		while(currentnode!=null) 
		{
			//Node index1=currentnode.getNext();
			int b=index1.getData();
			while(index1!=null) {
				if(a>b)
				{
					temp=a;
					a=b;
					b=temp;
				}
				index1=index1.getNext();
			}
			currentnode=currentnode.getNext();
			
	
		
	}
}
}
