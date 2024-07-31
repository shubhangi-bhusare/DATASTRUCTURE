package DoublyLinkedList;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.insert(20);
		list.insert(30);
		list.insert(60);
		list.insert(90);
		list.insert(70);
		//list.InsertAtPosition(50,2);
		list.DeleteByVal(70);
		//list.DeleteByPos(5);
		list.Display();
		

	}

}
