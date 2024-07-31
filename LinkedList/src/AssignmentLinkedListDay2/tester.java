package AssignmentLinkedListDay2;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDay2Assignment list=new LinkedListDay2Assignment();
		LinkedListDay2Assignment list1=new LinkedListDay2Assignment();
		LinkedListDay2Assignment mergelist=new LinkedListDay2Assignment();
		LinkedListDay2Assignment showmiddleelList=new LinkedListDay2Assignment();
		LinkedListDay2Assignment duplist=new LinkedListDay2Assignment();
		LinkedListDay2Assignment sortlist=new LinkedListDay2Assignment();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list1.insert(40);
		list1.insert(60);
		list1.insert(21);
		System.out.println("List1 is:");
		list.Display();
		System.out.println("List2 is:");
		list1.Display();
		System.out.println("Merged list is: ");
		mergelist=mergelist.mergelistt(list.getHead(), list1.getHead());
		mergelist.Display();
		System.out.println("---------------------------------Middle element-----------------------------------");
		showmiddleelList.insert(10);
		showmiddleelList.insert(70);
		showmiddleelList.insert(60);
		showmiddleelList.insert(90);
		showmiddleelList.insert(65);
		showmiddleelList.FindmiddleElement();
		System.out.println("-------------------------------Remove Duplicates-----------");
		duplist.insert(80);
		duplist.insert(10);
		duplist.insert(50);
		duplist.insert(10);
		duplist.insert(30);
		duplist.insert(10);
		duplist.insert(90);
		System.out.println("List is:");
		duplist.Display();
		System.out.println("After removing duplicates:");

		duplist.RemoveDuplicate();
		duplist.Display();
		//duplist.RemoveDuplicatesByHashSet();
//		sortlist.insert(10);
//		sortlist.insert(10);
//		sortlist.insert(20);
//		sortlist.insert(30);
//		sortlist.insert(30);
//		sortlist.insert(40);
		//sortlist.RemoveDuplicatesByHashSet();-->This also work for sorted list
//		sortlist.removeDupFromSortedList();
		

	}

}
