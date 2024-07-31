package QueueRevision;

public class QueueUsingArray<T> {
	private T arr[];
	private int rear;
	private int front;
	private int size;
	public QueueUsingArray(int size) {
		this.size=size;
		front=-1;
		rear=-1;
		arr=(T[])new Object[size];
	}
	public boolean isEmpty() {
		return front==-1 && rear==-1 || front>rear;
		
	}
	public boolean isFull() {
		return rear==(size-1);
	}
	public boolean enQueue(T data) {
		if(isFull()) {
			return false;
		}
		arr[++rear]=data;
		return true;
		
	}
	public T deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!!");
			return null;
		}
		return arr[++front];
	}

}
