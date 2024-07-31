package Seaching;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,52,45,63,12,48,79,84,61};
		System.out.println("Enter the key which you want to search");
		int key=sc.nextInt();
		Utils.LinearSearch(key, arr);

	}

}
