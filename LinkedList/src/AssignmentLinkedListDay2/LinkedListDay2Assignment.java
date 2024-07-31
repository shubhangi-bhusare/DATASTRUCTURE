package AssignmentLinkedListDay2;

import java.util.HashSet;
import java.util.Stack;

public class LinkedListDay2Assignment {
	private Node head;
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedListDay2Assignment() {
		head=null;
	}
	
	public boolean insert(int data) {
		Node newNode= new Node(data);
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
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	//10.How to merge two sorted linked list?
	//1.Java Program To Merge A Linked List Into Another Linked List At Alternate Positions
	public LinkedListDay2Assignment mergeList(Node l1, Node l2)
	{
		LinkedListDay2Assignment merge=new LinkedListDay2Assignment();
		while(l1!=null)
		{
			while(l2!=null)
			{
			//	merge=l1.getNext()+l2.getNext();
				merge.insert(l1.getData());
				merge.insert(l2.getData());
				l2=l2.getNext();
				l1=l1.getNext();
			}
	
		}
		
		return merge;
		
	}
	public LinkedListDay2Assignment mergelistt(Node n1, Node n2) {
		LinkedListDay2Assignment merge=new LinkedListDay2Assignment();
		while(n1!=null) {
			while(n2!=null) {
				merge.insert(n1.getData());
				merge.insert(n2.getData());
				
				n2=n2.getNext();
				n1=n1.getNext();
			}
		}
		return merge;
	}
	//2.How do you find the middle element of a singly linked list in one pass? 
	
	public void FindmiddleElement() {
		Node temp=head;
		int count=0;
		int middle=0;
		while(temp!=null) {
			temp=temp.getNext();
			count++;
		}
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
	
	public void findmid() {
		Node emp=head;
		int count=0;
		while(emp!=null) {
			count++;
			emp=emp.getNext();
		}
		System.out.println("Count is: "+count);
		if(count%2==0) {
			System.out.println("No middle element becoz list is of even number");
			return;
		}
		Node prev=head;
		for(int i=0;i<(count-1)/2;i++) {
			prev=prev.getNext();
		}
		System.out.println("Mid element is :"+prev.getData());
	}
	//3.How do you reverse a singly linked list without recursion?
	//7.How do you reverse a linked list? 
	public void reverseList() {
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		while (temp != null) {
			stack.push(temp);
			temp = temp.getNext();
		}
		while (!stack.isEmpty()) {
			System.out.print((stack.pop()).getData() + " ");
		}
		System.out.println();
	}
	//reverse using stack
	public void reverse() {
		Stack<Node> st=new Stack<Node>();
		Node temp=head;
		while(temp!=null) {
			st.push(temp);
			temp=temp.getNext();
		}
		while(!st.empty()) {
			System.out.print(st.pop().getData()+" ");
		}
		System.out.println();
				
	}
	//4.How are duplicate nodes removed in an unsorted linked list? 
	public Node RemoveDuplicate() {
		if(head==null) {
			return null;
		}
		Node curr=head;
		while(curr!=null) {
			Node temp=curr;
			
			while(temp.getNext()!=null) {
				if(temp.getNext().getData()==curr.getData())
				{
					temp.setNext(temp.getNext().getNext());
				}else {
					temp=temp.getNext();
				}			
			}
			curr=curr.getNext();
		}
		return head;
	}
	
	//4.How are duplicate nodes removed in an unsorted linked list? 
	public void RemoveDuplicatesByHashSet() {
		HashSet<Integer>hs=new HashSet<Integer>();
		Node curr=head;
		Node prev=null;
		while(curr!=null) {
			int curval=curr.getData();
			if(hs.contains(curval)) {
				prev.setNext(curr.getNext());
			}else {
				hs.add(curval);
				prev=curr;
			}
			curr=curr.getNext();
		}
		Node show=head;
		while(show!=null) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}
	}
	
	public void removeDupFromSortedList() {
		Node curr=head;
		while(curr!=null) {
			Node temp=curr;//assign current node to temp
			while(temp!=null && curr.getData()==temp.getData()) {//traverse till temp not equals to null
				//then give condition that boths data is equal means in sorted list equal data is near one another
				temp=temp.getNext();//increment temp	
			}
			curr.setNext(temp);
			curr=curr.getNext();
		}
		Node show=head;
		while(show!=null) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}
	}

	//5.How do you find the length of a singly linked list? 
	public void FindLenght() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			temp=temp.getNext();
			count++;
		}
		System.out.println("Length of List is: "+count);
	}
	
	
	//8.How do you find the third node from the end in a singly linked list?
	public void FindThirdElementFromEnd() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.getNext();
		}
		Node third=head;
		for(int i=1;i<count-2;i++) {
			third=third.getNext();
		}
		System.out.println("last third element is: "+third.getData());
	}
	
	//9.How to remove Nth Node from the end of a linked list? 
	
	//11.How to add an element at the middle of the linked list? 
	public void AddMiddleElement(int data) {
		Node temp=head;
		int length=0;
		while(temp!=null) {
			length++;
			temp=temp.getNext();
		}
		System.out.println("Length is: "+length);
		
		Node temp1=head;
		Node MiddleNode=new Node(data);
		for(int i=1;i<length/2;i++)
		{
			temp1=temp1.getNext();
		}
		MiddleNode.setNext(temp1.getNext());
		temp1.setNext(MiddleNode);
		
		Node show =head;
		while(show!=null) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}
	}

	//Check LinkedList is palindrome or not
	public void reverseLinkedList() {
		Stack<Node> st=new Stack<Node>();
		Node temp=head;
		while(temp!=null) {
			st.push(temp);
			temp=temp.getNext();
		}
		while(!st.empty()) {
			System.out.print(st.pop().getData()+" ");
		}
		System.out.println();
	}
	
	public boolean CheckPalindrome() {
		boolean isPalindrome=true;
		int data;
		Node check=head;
		Stack<Node> st=new Stack<Node>();
		Node temp=head;
		while(temp!=null) {
			st.push(temp);
			temp=temp.getNext();
		}
		while(!st.isEmpty()) {
			data=st.pop().getData();
			if(data==check.getData()) {
				isPalindrome=true;
			}else {
				isPalindrome=false;
				break;
			}
			check=check.getNext();
		}
		return isPalindrome;
	}

}
