package BinarySearchTree;

public class BSTUsingRecursion {
	private Node root;

	public BSTUsingRecursion() {
		root = null;
	}
	
	
	public Node getRoot() {
		return root;
	}


	public void setRoot(Node root) {
		this.root = root;
	}


	public boolean Insert(int data) {
		Node newNode=new Node(data);
		Node temp=root;
		
		if(newNode==null) {
			return false;
		}
		if(root==null) {
			root=newNode;
			return true;
		}
		while(true) {
			if(temp.getData()==data) {
				return false;
			}
			
			if(data<temp.getData()) {
				//insert at leftside
					if(temp.getLeft()==null) {
						temp.setLeft(newNode);
						return true;
					}
				temp=temp.getLeft();
				
			}else {
				if(temp.getRight()==null) {
					temp.setRight(newNode);
					return true;
				}
				
				temp=temp.getRight();
			}
			
		}
		
	}
	
	public void preOrder(Node r) {
		
		if(r==null) {
			return;
		}
		
		System.out.print(r.getData()+" ");
		preOrder(r.getLeft());
		preOrder(r.getRight());
		
	}
	
	public void inOrder(Node r) {
		
		if(r==null) {
			return;
		}
		inOrder(r.getLeft());
		System.out.print(r.getData()+" ");
		inOrder(r.getRight());
	}
	
	public void postOrder(Node r) {
		if(r==null) {
			return;
		}
		
		postOrder(r.getLeft());
		postOrder(r.getRight());
		System.out.print(r.getData()+" ");
	}
	
	public int GetCount(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+GetCount(root.getLeft())+GetCount(root.getRight());
	}
	
	public int GetMax() {
		if(root==null) {
			return 0;
		}
		Node temp=root;
		while(temp.getRight()!=null) {
			temp=temp.getRight();
		}
		return temp.getData();
	}
	public int GetMin() {
		if(root==null) {
			return 0;
		}
		Node temp=root;
		while(temp.getLeft()!=null) {
			temp=temp.getLeft();
		}
		return temp.getData();
	}
	
	public boolean Search(int key) {
		if(root==null) {
			return false;
		}
		Node temp=root;
		while(temp!=null) {
			if(temp.getData()==key) {
				return true;
			}
			if(key<temp.getData()) {
				temp=temp.getLeft();
			}
			else {
				temp=temp.getRight();
			}
		}
		return false;
	}
}
