package CircularLinkedList;

public class tester {

	public static void main(String[] args) {
		CircularLinkedList list=new CircularLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		//list.InsertByPos(80, 1);
		//System.out.println(list.insert(50));
		System.out.println("Display data");
		list.Display();
		System.out.println("After delete");
		//list.DeleteByVal(20);
		list.DeleteByPosition(2);
		list.Display();
	}

}
