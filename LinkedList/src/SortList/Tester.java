package SortList;

public class Tester {

	public static void main(String[] args) {
		SortLinkedList list=new SortLinkedList();
		SortLinkedList list1=new SortLinkedList();
		list.insert(20);
		list.insert(90);
		list.insert(10);
		list.insert(96);
		list.insert(60);
		list.Display();
		list.sorting();
		list.search(90);
//		list.sort();
//		list.SortList();
		//list.sort(list.getHead(),list.getHead());
		//System.out.println("list1 is:"+list1);
		
	}

}
