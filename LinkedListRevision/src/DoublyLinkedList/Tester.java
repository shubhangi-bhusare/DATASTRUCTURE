package DoublyLinkedList;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList li=new DoublyLinkedList();
		li.Insert(10);
		li.Insert(20);
		li.Insert(30);
		li.Insert(40);
		//li.Display();
		System.out.println();
//		li.InsertByPos(50,1);
//		li.InsertByPos(60,3);
	//	li.DeleteByVal(10);
		li.DeleteByPos(1);
		//li.DeleteByVal(30);
		li.Display();

	}

}
