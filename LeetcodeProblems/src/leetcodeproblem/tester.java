package leetcodeproblem;

public class tester {

	public static void main(String[] args) {
		LinkedList li1=new LinkedList();
		LinkedList li2=new LinkedList();
		LinkedList sumlist1=new LinkedList();
		
		li1.insert(10);
		li1.insert(5);
		li1.insert(9);
		li2.insert(39);
		li2.insert(9);
		li2.insert(3);
		System.out.println("List1 after reverse");
		 li1=li1.reverselist();
		
		li1.Display();
		System.out.println("List2 after reverse");
		li2=li2.reverselist();
		
		li2.Display();
		System.out.println("-------------------------------");
		sumlist1=sumlist1.sumofrev(li1.getHead(), li2.getHead());
		sumlist1.Display();

	}

}
