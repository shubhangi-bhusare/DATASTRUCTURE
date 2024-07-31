package BinarySearchTree;

public class Tester {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
//		System.out.println(bs.insert(10));
//		System.out.println(bs.insert(20));
		
       
		bst.insert(50);
		bst.insert(35);
		bst.insert(80);
		bst.insert(30);
		bst.insert(70);
		bst.insert(100);
		
        bst.PreOrderr();
       bst.inOderr();
//		bst.Delete(100);
//		bst.Delete(30);
//		bst.Delete(100);
//		bst.Delete(80);
		bst.Delete(50);
		bst.inOderr();
//       bst.postOrder();
//       System.out.println();
//        bst.postorder();
//		

	}

}
