package leetcodeproblem;

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
	public LinkedList reverselist() {
		Stack <Node> stack=new Stack<>();
		LinkedList list=new LinkedList();//we give Linkedlist return type so we need to store list in list so we take this list
		Node temp=head;
	   while(temp!=null) {
		stack.push(temp);
		temp=temp.getNext();
		
	}
	while(!stack.isEmpty())
		{
//			System.out.print(stack.pop().getData()+" ");
		list.insert((stack.pop().getData()));
		
		}
	return list;
	
	
	}
	public LinkedList sumofrev(Node l1,Node l2) {
		Node temp1=l1;
		Node temp2=l2;
		LinkedList li=new LinkedList();
		int sum=0;
		while(temp1!=null) 
		{
			while(temp2!=null) {
				sum=temp2.getData()+temp1.getData();
				li.insert(sum);
				temp2=temp2.getNext();
				temp1=temp1.getNext();
			}
			
		}
		return li; 		
		
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
