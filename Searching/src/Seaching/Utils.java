package Seaching;

public class Utils {
	public static void LinearSearch(int key,int [] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Key is found on index: "+i+" Element is: "+arr[i]);
			}		
		}
		
	}

}
