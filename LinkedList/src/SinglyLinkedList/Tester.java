package SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		LinkedList li1=new LinkedList();
		li.insert(10);
		li.insert(10);
		li.insert(20);
		li.insert(90);
		li.insert(40);
		li.insert(70);
		li.insert(50);
		li.insert(50);//duplicate not allowed
		li.insert(50);
		li.InsertByPosition(1,30);
		li.InsertByPosition(2,66);
		li.InsertByPosition(1, 30);
		li.InsertByPosition(9, 88);
		li.Display();
//		System.out.println("After reverse");
//		li.reverse();
//		li.Display();
//		System.out.println("after delete");
//		li.deleteByVal(50);
//		while(li.deleteByVal(50))  if we want to delete duplicate becoz deletebyval function return boolean value
//    	li.Display();
//		System.out.println("Delete by position:");
//		li.deletebyPos(5);
//		li.deletebyPos(10);//delete by invalid position is also work
//		li.Display();
//		li.deletebyvalue(30);
//		li.deletebyvalue(90);
//		li.deletebyvalue(88);
//		li.DeleteByPosition(1);
//		li.DeleteByPosition(3);
//		li.DeleteByPosition(9);
		li.Display();
		
		
		

	}

}
