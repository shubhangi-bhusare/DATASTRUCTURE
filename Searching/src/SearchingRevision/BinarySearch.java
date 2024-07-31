package SearchingRevision;

public class BinarySearch {
	//BINARY SEARCH ONLY WORK ON SORTED ARRAY SO TAKE CARE DURING GIVING INPUT
	public static int BinarySearch(int key, int arr[]) {
		int high=arr.length-1;
		int low=0;
		int mid;
		
		while(low<=high) {
			mid=(high+low)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}
		



	public static void main(String[] args) {

		int arr[]= {9,15,20,22,30,44,48,54};
		int key=BinarySearch(48, arr);
		System.out.println("searched element is on index :"+key);
		
	}

}
