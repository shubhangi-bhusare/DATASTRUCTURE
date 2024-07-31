package QueuePractice;

public class Node {
	private Node Next;
	private int data;
	
	public Node(int data) {
		this.data=data;
		Next=null;
	}

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		Next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
