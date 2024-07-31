package CircularLinkedList;

public class RevisionTester {

	public static void main(String[] args) {

		CircularLinkedList list=new CircularLinkedList();
		list.insertdata(10);
		list.insertdata(80);
		list.insertdata(30);
		list.insertdata(40);
//		list.insertdata(50);
		System.out.println(list.insertdata(60));
//		list.displayrev();
		//list.insertbypos(1,200);
//		list.insertbypos(3, 660);
		System.out.println("Aer ");
//		list.Deletebyvalue(10);
//		list.Deletebyvalue(60);
//		list.Deletebyvalue(30);
//		list.deletebyposition(1);
//		list.deletebyposition(2);
//		list.deletebyposition(6);
		list.displayrev();
		//list.sorting();
		list.FindmiddleElement();
//		list.findmid();

	}

}
