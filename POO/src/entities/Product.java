package entities;

public class Product {
	private String name;
	private double price;
	private int qttInStock;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int qttInStock) {
		this.name = name;
		this.price = price;
		this.qttInStock = qttInStock;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQttInStock() {
		return qttInStock;
	}

	public double TotalValueInStock() {
		return price * qttInStock;
	}
	
	public void addProducts(int quantity) {
		qttInStock += quantity;
	}
	
	public void removeProducts(int quantity) {
		qttInStock -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ qttInStock
			+ " units"
			+ " Total: $ "
			+ String.format("%.2f", TotalValueInStock());
	}
}
