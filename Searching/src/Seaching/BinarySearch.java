package Seaching;

public class BinarySearch {
	public static int BinarySearchofElements(int key,int [] arr) {
		int high=arr.length-1;
		int low=0;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key<arr[mid]) {
				 high=mid-1;
			}else {
				 low=mid+1;
			}
		}
		return -1;
		
	}
	public static int BinarySearchofElementsChar(char key,char [] arr) {
		int high=arr.length-1;
		int low=0;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key<arr[mid]) {
				 high=mid-1;
			}else {
				 low=mid+1;
			}
		}
		return -1;
		
	}
	
	public static int BinarySearchUsingRecursion(int arr[], int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid=(high+low)/2;
		if(key==arr[mid]) {
			return mid;
		}
		if(key<arr[mid]) {
			return BinarySearchUsingRecursion(arr, key, low, mid-1);
		}else {
			return BinarySearchUsingRecursion(arr, key, mid+1, high);
		}
		
	}
	
	public static int Binaryserch(int key,int arr[]) {
		int high=arr.length-1;
		int low=0;
		int mid=0;
		mid=(high+low)/2;
		while(low<=high) {
		if(key==arr[mid]) {
			return mid;
		}else if(key<arr[mid]){
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {9,15,20,22,30,44,48,54};
//		char arr1[]= {'A','B','C','D','E','F','G'};
//		int es= BinarySearchofElementsChar('C', arr1);
//		System.out.println("Index is of Character is: "+es);
		int key=BinarySearchofElements(48, arr);
		System.out.println("searched element is on index :"+key);
		int low=0;
		int high=arr.length-1;
	
//		System.out.println("Using recursion Binary Search");
//		int k=BinarySearchUsingRecursion(arr, 20, low, high);
//		System.out.println("searched element using recursion is: "+k);
//		int x=Binaryserch(22, arr);
//		System.out.println("=========="+x++);
	}

}
