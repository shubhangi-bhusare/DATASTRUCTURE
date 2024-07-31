package LinkedList.Assingment;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAssignment li=new LinkedListAssignment();
		li.insert(8);
		li.insert(1);
		li.insert(2);
		li.insert(5);
		li.insert(7);
		li.insert(4);
		li.display();
		System.out.println("Max element is:");
		li.maxElement();
		System.out.println("Minimum element is:");
		li.minElement();
		System.out.println("Even elements are:");
		li.EvenElement();
		System.out.println("Sum of even elements is:");
		li.sumOfEvenElem();
		
		

	}

}
