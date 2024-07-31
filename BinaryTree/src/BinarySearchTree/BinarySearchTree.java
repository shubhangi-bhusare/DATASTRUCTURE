package BinarySearchTree;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}
	public boolean insert(int data) {
		Node newNode=new Node(data);
		
		if(newNode==null) {
			return false;
		}
		
		if(root==null) {
			root=newNode;
			return true;
		}
		Node temp=root;
		while(true) {
			if(data==temp.getData()) {
				return false;
			}
			if(data<temp.getData()) {
				if(temp.getLeft()==null) {
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
				
			}
			else {
				if(temp.getRight()==null) {
					temp.setRight(newNode);
					return true;
				}
				temp=temp.getRight();
			}
			
		}

	}
	
	public void preOrder() {
		System.out.println("Preorder is:");
		Node temp=root;
		Stack<Node> stack=new Stack<Node>();
		
		while(temp!=null|| !stack.empty()) {
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				stack.push(temp);
				temp=temp.getLeft();
			}
			temp=stack.pop().getRight();			
		}
		System.out.println();
		
	}
	
	public void inOrder() {
		Node temp=root;
		Stack<Node> stack=new Stack<Node>();
		while(temp!=null || !stack.empty()) {
			while(temp!=null) {
				stack.push(temp);
				temp=temp.getLeft();
			}
			temp=stack.pop();
			System.out.print(temp.getData()+" ");
			temp=temp.getRight();
		}
	}
	
	
	
	
	public void inOderr() {
		System.out.println("Inorder is:");
		Node temp=root;
		Stack<Node> s=new Stack<Node>();
		while(temp!=null || !s.empty()) {
			while(temp!=null) {
				s.push(temp);
				temp=temp.getLeft();
			}
			temp=s.pop();
			System.out.print(temp.getData()+" ");
			temp=temp.getRight();
		}
		System.out.println();
	}
	
	
	public void PreOrderr() {
		System.out.println("PreOrder is:");
		Node temp=root;
		Stack<Node> s=new Stack<Node>();
		while(temp!=null || !s.empty()) {
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				s.push(temp);
				temp=temp.getLeft();
			}
			temp=s.pop().getRight();
		}
		
		System.out.println();
	}
	
	
	
	public void postOrder() {
		System.out.println("PosOrder is:");
		class Pair{
			private Node node;
			private char flag;
			
			public Pair(Node node,char flag) {
				this.node=node;
				this.flag=flag;
			}
		}
		Stack<Pair> st=new Stack<Pair>();
		Node temp=root;
		while(temp!=null||!st.empty()) {
			while(temp!=null) {
				st.push(new Pair(temp,'L'));
				temp=temp.getLeft();
			}
			Pair pair=st.pop();
			if(pair.flag=='L') {
				temp=pair.node.getRight();
				pair.flag='R';
				st.push(pair);
				
			}else {
				System.out.print(pair.node.getData()+" ");
			}
		}
	}
	
	
	public void postorder() {
		class Pair {
			private Node node;
			private char flag;
			
			public Pair(Node node,char flag) {
				this.node=node;
				this.flag=flag;
						
			}
			
		}
		Stack <Pair> st=new Stack<Pair>();
		Node temp=root;
		while(temp!=null || !st.empty()) {
			while(temp!=null) {
				st.push(new Pair(temp,'L'));
				temp=temp.getLeft();
			}
			Pair pair=st.pop();
			if(pair.flag=='L') {
				temp=pair.node.getRight();
				pair.flag='R';
				st.push(pair);
				
			}
			else {
				System.out.print(pair.node.getData()+" ");
			}
		}
	}
	
	public boolean Delete(int data) {
		Node del=root;
		Node parent=root;
		
		while(del.getData()!=data) 
		{
			parent=del;
			if(data<del.getData()) {
				del=del.getLeft();
			}else {
				del=del.getRight();
			}
			if(del==null) {
				return false;
			}
		}
		while(true) {
			if(del.getLeft()==null&&del.getRight()==null) {
				if(root==del) {
					root=null;
					return true;
				}
				if(parent.getLeft()==del) {
					parent.setLeft(null);
				}
				else {
					parent.setRight(null);
				}
				return true;
			}
			
			//for Non-terminal Node
			if(del.getLeft()!=null) {
				Node max=del.getLeft();
				parent=del;
				while(max.getRight()!=null) {
					parent=max;
					max=max.getRight();
				}
				int temp=del.getData();
				del.setData(max.getData());
				max.setData(temp);
				del=max;
				
			}else {
				Node min=del.getRight();
				parent=del;
				while(min.getLeft()!=null) {
					parent=min;
					min=min.getLeft();
							
				}
				int temp=del.getData();
				del.setData(min.getData());
				min.setData(temp);
				del=min;
			}
		}
		
	}
	
	
}
