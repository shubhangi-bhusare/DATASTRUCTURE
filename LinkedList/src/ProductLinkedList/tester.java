package ProductLinkedList;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		System.out.println("Enter the product details- pid, pname, quantity,price");
		Product prod1=new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat());
		list.insert(prod1);
		Product prod2=new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat());
		list.insert(prod2);
		Product prod3=new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat());
		list.insert(prod3);
		list.display();

	}

}
