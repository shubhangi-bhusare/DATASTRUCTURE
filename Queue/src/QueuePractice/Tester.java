package QueuePractice;

public class Tester {

	public static void main(String[] args) {
		DynamicQueuePractice q=new DynamicQueuePractice();
		q.enqueue(10);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(90);
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		
		
	}

}
