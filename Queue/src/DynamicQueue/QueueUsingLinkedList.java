package DynamicQueue;

public class QueueUsingLinkedList {
	private Node rear;
	private Node front;
	public QueueUsingLinkedList() {
		rear=null;
		front=null;
	}
	public boolean isEmpty() {
		return front==null || rear==null;
	}
	
	public boolean enQueue(int data) {
		Node newNode=new Node(data);
		if(rear==null) {
			rear=newNode;
		}
			rear.setNext(newNode);
			rear=newNode;
			
		if(front==null) {
			front=rear;
		return true;
		}
		return true;
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!");
			return -999;
		}
		int data=front.getData();
		front=front.getNext();
		return data;
		
	}
	

}
