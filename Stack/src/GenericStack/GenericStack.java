package GenericStack;

public class GenericStack<T> {
	private int size;
	private int top;
	private T[] arr;
	
	public GenericStack(int size) {
		this.size=size;
		top=-1;
		arr=(T[]) new Object[size];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public boolean Push(T data) {
		if(isFull()) {
			return false;
		}
		arr[++top]=data;
		return true;
	}
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		return arr[top--];
	}
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		return arr[top];
	}

}
