package CircularQueue;

public class TesterCircQueue {

	public static void main(String[] args) {
		CircularQueue cq=new CircularQueue(5);
//		cq.insert(90);
//		System.out.println(cq.delete());//it return 90
//		System.out.println(cq.insert(10));
//		System.out.println(cq.insert(20));
//		System.out.println(cq.insert(30));
//		System.out.println(cq.insert(40));
//		System.out.println(cq.insert(50));//it return false becoz here queue is full but one position get vacant we can compromise that one memory space
		//our queue size is 5 but we able to insert only 4 elements
//	    System.out.println(cq.delete());
//		System.out.println(cq.delete());//here only 2 elements remain in que so we able to insert 2 element only becoz we compromise one memory space
//		System.out.println(cq.insert(230));//they are inserted becoz que is get empty when 2 pos are deleted
//		System.out.println(cq.insert(340));
//		System.out.println(cq.insert(90));
//		cq.Display();
//	    cq.FindMax();
//		
		cq.insert(10);
		cq.insert(20);
		cq.insert(70);
		cq.insert(60);
//		cq.insert(10);
		cq.Display();
		cq.FindMax();
	}

}
