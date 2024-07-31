package CircularLinkedList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list=new CircularLinkedList();
		list.Insert(10);
		list.Insert(20);
		list.Insert(30);
		list.Insert(40);
		list.Insert(50);
		//System.out.println(list.Insert(90));
		//list.insertByPosition(50, 7);
		//list.DeleteByVal(20);
		list.findmid();
//		list.DeleteByPos(1);
		list.Display();

	}

}
