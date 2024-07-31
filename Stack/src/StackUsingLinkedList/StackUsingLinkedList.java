package StackUsingLinkedList;

public class StackUsingLinkedList {
	private Node top;
	public StackUsingLinkedList() {
		// TODO Auto-generated constructor stub
		top=null;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public boolean push(int data) {
		Node newNode=new Node(data);
		if(top==null) {
			//if stack is empty then we need to set top as newNode
			top=newNode;
			return true;
		}
		//if top is not empty
		newNode.setNext(top);//here  newNodes store reference of top
		top=newNode;//assign top to newNode means we increment the top in each push operation
		return true;//In linkedlist we iterate on the list by temp variable but head is not change but here we increment actual top node so we dont need while loop
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
			return -999;
		}
		int data=top.getData();//store the data of top
		 top=top.getNext();//then in second pop operation we need to increment top
		return data;
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!!");
			return -999;
		}
		return top.getData();
		
	}
}
