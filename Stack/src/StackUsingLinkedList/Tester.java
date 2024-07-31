package StackUsingLinkedList;

public class Tester {

	public static void main(String[] args) {
		StackUsingLinkedList st=new StackUsingLinkedList();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.push(40));
		st.display();
		System.out.println("First node: "+st.pop());
//		System.out.println("Second node: "+st.pop());
//		System.out.println("third node: "+st.pop());
//		System.out.println("fourth node: "+st.pop());
//		System.out.println("fourth node: "+st.pop());
		st.display();
		System.out.println("Topmost element in stack is:");
		System.out.println(st.peek());

	}

}
