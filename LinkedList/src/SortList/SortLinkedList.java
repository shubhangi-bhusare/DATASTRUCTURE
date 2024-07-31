package SortList;

import AssignmentLinkedListDay2.Node;

public class SortLinkedList {
private Node head;
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public SortLinkedList() {
		head=null;
	}
	
	public boolean insert(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
			
		}
		temp.setNext(newNode);
		return true;
		
		
	}
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	//this logic of sorting work
	public void SortList() 
	{
		Node temp1=head;
		Node temp2=temp1.getNext();
		
		int count=0;
		while(temp1!=null) {
			count++;
			temp1=temp1.getNext();
		}
		System.out.println("Count is: "+count);
		for(int i=0;i<count;i++) {
			 temp1=head;
			 temp2=temp1.getNext();
			while(temp2!=null) {
				
				if(temp1.getData()>temp2.getData())
				{
					System.out.println("temp1 is"+temp1.getData());
					System.out.println("temp2 is"+temp2.getData());
					int swap=temp1.getData();//in swap variable we put data of temp1
					temp1.setData(temp2.getData());//in temp1 variable we put data of temp2
					temp2.setData(swap);//in temp2 variable we put data of swap
				}
				temp1=temp1.getNext();
		
			temp2=temp2.getNext();
			}		
		}
		//to display the sorted data
		Node d=head;
		while(d!=null) {
			System.out.print(d.getData()+" ");
			d=d.getNext();
		}
	}
	public void sorting() {
		Node t1=head;
		Node t2=t1.getNext();
		int count=0;
		while(t1!=null) {
			count++;
			t1=t1.getNext();
		}
		System.out.println("count is :"+count);
		for(int i=1;i<count;i++) {
			t1=head;
			t2=t1.getNext();
			while(t2!=null) {
				if(t1.getData()>t2.getData()) {
					int temp=t1.getData();
					t1.setData(t2.getData());
					t2.setData(temp);
				}
				t2=t2.getNext();
				t1=t1.getNext();
			}
			
		}
		System.out.println("Sorting in Ascending order is: ");
		Node show=head;
		while(show!=null) {
			System.out.print(show.getData()+" ");
			show=show.getNext();
		}
	}
	public void search(int key) {
		Node temp=head;
		while(temp!=null) {
			if(temp.getData()==key) {
				System.out.println("\nElement is present!!! \nSearched element is: "+temp.getData());
			}
			temp=temp.getNext();
		}
	}
	
	//12.How do you sort a linked list in Java?
	//Below Logic is not work for sorting
	public void sort() {
		Node t1=head;
		Node t2=t1.getNext();
//		int count=0;
		//SortLinkedList lis=new SortLinkedList();
		while(t1!=null) {
//			t1=head;
			//t2=t1.getNext();//we are comparing two nodes is single list so the second node in the list 
			//get null when both nodes are reach to last.. so we dont take while loops for comparing two nodes in list for 
			//that we can take for loop till its size and then we can swap that 2 nodes in single list
		
			
			while(t2!=null) {
//				System.out.println("hi");
//				System.out.println("data"+t1.getData());
//				System.out.println("t2 data is:"+t2.getNext().getData());
				if(t1.getData()<t2.getData()) {//here it got null value i.e t2.getData() becoz t2 is next node it reach to null when t1 reach to last
					int swap=t1.getData();
					t1.setData(t2.getData());
//					System.out.println("t1 is"+t1);
					t2.setData(swap);
//					lis.insert(swap);
//					System.out.println("swap is"+swap);
			}
				t1=t1.getNext();
				
				
			}
			t2=t2.getNext();
			
		}
		//return lis ;
		
		Node temp=head;
		while(temp!=null) 
		{
		System.out.print(temp.getData()+" ");
		temp=temp.getNext();
		}
	}

}
