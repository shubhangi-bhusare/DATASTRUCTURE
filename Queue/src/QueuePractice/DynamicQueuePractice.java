package QueuePractice;

public class DynamicQueuePractice {
	private Node front;
	private Node rear;
	public DynamicQueuePractice() {
		front=rear=null;
	}
	public boolean isEmpty() {
		return front==null || rear==null;
	}
	public boolean enqueue(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
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
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -999;
		}
		int data=front.getData();
		front=front.getNext();
		return data;
	}

}
