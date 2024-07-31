package Stack;

//Stack Implementation by using array
public class Stack <T> {
	T [] arr;
	int size;
	int top;
	public Stack(int size) {
		this.size=size;
		top=-1;
		arr=(T[])new Object[size];
	}
	public boolean isEmpty() {
		return top == -1;
		
	}
	
	public boolean isFull() {
		return top == (size-1);//arr start from index 0 so size-1 means it reach at the end means it gets full
	}
	public boolean Push(T data) {
		if(isFull()) {
			return false;
		}
		arr [++top]= data;//here top get incremented and data is assign to it
		return true;
		
	}
	public T Pop() {
		if(isEmpty()) {
			return null;
		}
		return arr[top--];//elements from array get remove means top get decrement by 1 when function is called
		
	}
	//it will Display the first element without removing it
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
			return null;
		}
		
		return arr[top];
		
	}
//	public void display() {
//		if(isEmpty()) {
//			System.out.println("Stack is empty!!!");
//		}
//		T i=arr[top];
//		for(int q=0;q<=top;q++) {
//			System.out.println(q);
//		}
//		
//		while(i!=null) {
//			System.out.println(i);
//			break;
//		}
//		
//	}
	

}
