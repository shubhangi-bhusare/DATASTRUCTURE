package GenericStack;

import java.util.Scanner;

public class CheckPalindromeOrNot {

	public static void main(String[] args) {
		GenericStack<Character> st=new GenericStack<Character>(5);
//		System.out.println(st.Push(10));
//		st.Push(20);
//		st.Push(30);
//		System.out.println(st.pop());
////		System.out.println(st.peek());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String revString="";
		for(int i=0;i<str.length();i++) {
			st.Push(str.charAt(i));
		}
		while(!st.isEmpty()) {
			revString=revString+st.pop();
		}
		System.out.println("Revese string is: "+revString);
		if(str.equals(revString)) {
			System.out.println("String is palindrome!!!");
		}else {
			System.out.println("String is not palindrome!!");
		}

	}

}
