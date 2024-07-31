package Day1LinkedListProductAss;

public class Tester {

	public static void main(String[] args) {
		ProductLinkedList list=new ProductLinkedList();
		Product p1=new Product(1, "Borbon", 4, 60);
		Product p2=new Product(2, "happy-happy", 8, 90);
		Product p3=new Product(3, "Oreo", 9, 120);
		Product p4=new Product(4, "Magix", 5, 50);
		
		System.out.println("Products are: ");
		list.InsertProduct(p1);
		list.InsertProduct(p2);
		list.InsertProduct(p3);
		list.InsertProduct(p4);
		list.DisplayProduct();
		

	}

}
