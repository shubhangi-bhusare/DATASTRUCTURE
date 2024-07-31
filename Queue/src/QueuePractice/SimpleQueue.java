package QueuePractice;

public class SimpleQueue {
	private int front;
	private int rear;
	private int size;
	private int arr[];
	
	public SimpleQueue(int size) {
		this.size=size;
		rear=-1;
		front=-1;
		arr=new int[size];
	}
	public boolean isEmpty() {
		return (front==-1 && rear==-1) || front>rear;
		
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full!!!");
			return false;
		}
		if(front==-1) {
			front=0;
			
		}
		arr[++rear]=data;
		return true;
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!!");
			return -999;
		}
		
		return arr[front++];
	}
	
	
	public static void main(String[] args) {
		SimpleQueue q=new SimpleQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(60);
		q.enqueue(80);
		System.out.println(q.enqueue(70));
		System.out.println(q.enqueue(66));
//		System.out.println(q.dequeue());
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}

}
