package Stack;

public class Tester {

	public static void main(String[] args) {
		Stack<String>stack=new Stack <String>(5);
		stack.Push("shubhangi");
		stack.Push("mahesh");
		stack.Push("shilpa");
		//stack.display();
		System.out.println(stack.peek());
		System.out.println(stack.Pop());

	}

}
