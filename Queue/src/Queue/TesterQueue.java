package Queue;

public class TesterQueue {

	public static void main(String[] args) {
		Queue q=new Queue(6);
		q.insert(10);
		System.out.println(q.delete());//it return 10 i.e deleted element
		System.out.println(q.insert(20));
        System.out.println(q.insert(30));
        System.out.println(q.insert(40));
        System.out.println(q.insert(50));
        System.out.println(q.insert(40));
		System.out.println(q.insert(70));//it is not inserted so it return false
		//above queue is get full beacoz we inserted element till its size if we delete that element still
		//we cant able to insert the element in queue 
		//this is the drawback of simple queue and it is useless becoz it is full and empty at same time
		System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());
        System.out.println(q.delete());

        System.out.println(q.isEmpty() + " " + q.isFull());//here queue is full and empty at same time
        //solution on this is--> 1. we can implement queue by using LinkedList
        					//   2. we can shift queue elements on the deleted side when they are deleted
        						//but this solution is very costly
        						//3.we can shift queue elements in bulk (BULK SHIFTING)
	}

}
