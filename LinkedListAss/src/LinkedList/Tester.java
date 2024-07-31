package LinkedList;

public class Tester {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insertPos(60, 2); 
		//System.out.println(list);
		list.Display();
		System.out.println("Reverse List is: ");
		list.reverselist();
		System.out.println();
		System.out.println("Reverse By Recursion:");
		list.ReverseByRecursion(list.getHead());
		System.out.println("Sorted elements are: ");
		list.sortList();
		list.Display();

	}

}
