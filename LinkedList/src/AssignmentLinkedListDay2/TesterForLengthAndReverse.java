package AssignmentLinkedListDay2;

public class TesterForLengthAndReverse {

	public static void main(String[] args) {
	LinkedListDay2Assignment list=new LinkedListDay2Assignment();
	list.insert(10);
	list.insert(90);
	list.insert(60);
//	list.insert(10);
	list.insert(96);
//	list.insert(880);
//	list.insert(70);
//	list.FindLenght();
//	System.out.println("List is:");
//	list.Display();
//	System.out.println("Reversed List is: ");
//	list.reverseList();
//	list.FindThirdElementFromEnd();
	System.out.println("----------");
	list.AddMiddleElement(100);
//	list.reverseLinkedList();
//	list.reverse();
//	list.Display();
//	list.Display();
//	list.findmid();
	list.FindmiddleElement();
	boolean flag=list.CheckPalindrome();
	if(flag) {
		System.out.println("List is palindrome!!!");
	}else {
		System.out.println("List is not palindrome!!!");
	}

	}

}
