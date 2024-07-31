package ProductLinkedList;

public class Product {
	private int pid;
	private String name;
	private int qty;
	private float price;
	
	public Product(int pid,String name,int qty,float price) {
		this.pid=pid;
		this.name=name;
		this.qty=qty;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
