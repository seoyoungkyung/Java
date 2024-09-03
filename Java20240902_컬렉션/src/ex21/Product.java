package ex21;

public class Product {

	String productID;
	String productName;
	String productPrice;

	public Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public int hashCode() {

		return productID.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product p) {
			return p.productID.equals(productID);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		return " " + getProductID() + " " + getProductName() + " " + getProductPrice();
	}
}
