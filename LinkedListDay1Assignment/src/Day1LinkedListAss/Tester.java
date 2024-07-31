package Day1LinkedListAss;

public class Tester {

	public static void main(String[] args) {
		LinkedListAssignment li=new LinkedListAssignment();
		li.insert(10);
		li.insert(21);
		li.insert(93);
		li.insert(36);
		li.insert(42);
		li.insert(42);
		li.insert(42);
		li.insert(21);
		li.insert(87);
		System.out.println("List is: ");
		li.Display();
		System.out.println("After removing duplicates: ");
		li.removeDuplicate();
//		li.getmax();
//		li.findMax();
//		li.FindMin();
//		System.out.println("All even no are: ");
//		li.EvenElement();
//		li.FindEvenNoSum();
		
	}

}
