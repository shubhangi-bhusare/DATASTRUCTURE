package DoublyLinkedList;

public class TesterrRevision {

	public static void main(String[] args) {
		DoublyLinkedList li=new DoublyLinkedList();
		li.insertt(10);
		li.insertt(20);
		li.insertt(30);
		li.insertt(40);
		li.insertt(50);
//		li.insertbyposition(1, 88);
//		li.insertbyposition(3, 90);
//		li.insertbyposition(6, 77);
//		li.deletebyvalue(10);
//		li.deletebyvalue(20);
		li.DeleteByPosition(1);
		li.displayy();
		

	}

}
