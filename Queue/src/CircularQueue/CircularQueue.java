package CircularQueue;

public class CircularQueue {
	private int[] arr;
	private int rear;
	private int front;
	private int size;
	
	public CircularQueue(int size) {
		this.size=size;
		front=rear=-1;
		arr=new int[size];
	}
	public boolean isFull() {
		return (rear==(size-1) && front==-1)||((rear+1)%size==front);
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
		return true;
	}
	public int delete() {
		if(isEmpty()) {
			return -999;
		}
		front=(front+1)%size;
		return arr[front];
	}
	public void Display() {
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void FindMax() {
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
		}
		int max=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					max=i;
				}
			}
		}
		System.out.println("Max element is: "+arr[max]);
	}

}
