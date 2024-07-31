package Day1LinkedListProductAss;

public class Product {
	private int productId;
	private String pname;
	private int qty;
	private float price;
	public Product(int productId,String pname,int qty, float price) {
		this.productId=productId;
		this.pname=pname;
		this.qty=qty;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
