package DynamicQueue;

public class Tester {

	public static void main(String[] args) {
		QueueUsingLinkedList q=new QueueUsingLinkedList();
		q.enQueue(10);
		System.out.println(q.enQueue(20));
		q.enQueue(30);
		while(!q.isEmpty()) {
			System.out.println(q.deQueue());
		}
//		System.out.println(q.deQueue());
//		System.out.println(q.deQueue());
//		System.out.println(q.deQueue());
		//System.out.println(q.deQueue());

	}

}
