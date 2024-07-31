package Queue;

public class Queue {
	private int arr[];
	private int size;
	private int front,rear;
	
	public Queue(int size){
		this.size=size;
		arr=new int[size];
		front=rear=-1;
	}
	public boolean isEmpty() {
		return (front==-1&&rear==-1)||front>rear;
	}
	public boolean isFull() {
		return rear==(size-1);
	}
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		arr[++rear]=data;//we can insert data by rear so need to preincrement rear
		//by preincrement it will increment first  and then insert
		if(front==-1) {//put front on 0th position
			front=0;
		}
		return true;
	}
	public int delete() {
		if(isEmpty()) {
			return -999;
		}
		return arr[front++];//we can delete data by front so need to postincrement front
		//by postincrement it will first delete and then increment  
	}
	

}
