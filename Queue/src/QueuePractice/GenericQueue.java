package QueuePractice;

public class GenericQueue<T> {
	private int size;
	private int front;
	private int rear;
	private T arr[];
	
	public GenericQueue(int size) {
		this.size=size;
		front=rear=-1;
		arr=(T[]) new Object[size];
	}
	public boolean isEmpty() {
		return ( front==-1 && rear==-1) || front>rear;
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean enqueue(T data) {
		if(isFull()) {
			System.out.println("Queue  is full!!!");
			return false;
		}
		if(front==-1) {
			front=0;	
		}
		arr[++rear]=data;
		return true;
	}
	public T dequeue() {
		if (isEmpty() ){
			System.out.println("Queue is empty!!!");
			return null;
		}
		return arr[front++];
	}
	

	public static void main(String[] args) {
		GenericQueue<Integer> q=new GenericQueue<Integer>(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(80);
		q.enqueue(70);
		q.enqueue(60);
		System.out.println(q.dequeue());
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		
	}

}
