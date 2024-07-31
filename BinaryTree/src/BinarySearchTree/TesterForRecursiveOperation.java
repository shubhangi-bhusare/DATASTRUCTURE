package BinarySearchTree;

public class TesterForRecursiveOperation {

	public static void main(String[] args) {
		BSTUsingRecursion bs=new BSTUsingRecursion();
		bs.Insert(10);
//		System.out.println(bs.Insert(50));
//		System.out.println(bs.Insert(5));
//		System.out.println(bs.Insert(80));
		bs.Insert(60);
		bs.Insert(80);
		bs.Insert(70);
		bs.Insert(20);
		bs.Insert(30);
		bs.Insert(40);
		System.out.println("PreOrder is: ");
		bs.preOrder(bs.getRoot());
		System.out.println();
		System.out.println("postOrder is: ");
		bs.postOrder(bs.getRoot());
		System.out.println();
		System.out.println("inOrder is: ");
		bs.inOrder(bs.getRoot());
		System.out.println();
		int cnt=bs.GetCount(bs.getRoot());
		System.out.println("Count is: "+cnt);
		int max=bs.GetMax();
		System.out.println("Max no is: "+max);
		int min=bs.GetMin();
		System.out.println("Min no is: "+min);
		System.out.println(bs.Search(880));

	}

}
