package QueueRevision;

public class Tester {

	public static void main(String[] args) {
		QueueUsingArray<Integer> q=new QueueUsingArray<Integer>(5);
		q.enQueue(10);
		System.out.println(q.enQueue(20));
		System.out.println(q.enQueue(30));
		System.out.println(q.enQueue(40));
		System.out.println(q.enQueue(50));
		System.out.println(q.enQueue(60));
		System.out.println(q.deQueue());

	}

}
