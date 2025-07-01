package com.TASK03june;

public class Product {
	String productId;
	String productName;
	double price;
	int quantity;
	static String storeName;
	static int totalProducts;

	public Product(String productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		totalProducts++;
		System.out.println("Product is Added...");
	}

	Product() {

		this.productId = "Unknown";
		this.productName = "Unknown";
		this.price = price;
		this.quantity = quantity;
	}

	void addStock(int amount) {
		quantity = quantity + amount;
		System.out.println("Stock is added...");
	}

	void sellProduct(int amount) {
		quantity = quantity - amount;
		System.out.println("Product is Sold....");
	}

	void printProductDetails() {
		System.out.println("Product Id: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
		System.out.println("Product Quantity: " + quantity);

	}

	static void setStoreName(String name) {
		storeName = name;

	}

	static void printTotalProducts() {
		System.out.println("Total Products: " + totalProducts);

	}

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.printProductDetails(); // for default
		System.out.println("*******************************");

		Product p2 = new Product("1234", "tide detergent", 500, 3);
		setStoreName("Dmart");
		printTotalProducts();
		System.out.println("Store Name: " + storeName);
		p2.printProductDetails();
		System.out.println("*******************************");
		Product p3 = new Product("456", "wheel detergent", 300, 1);
		Product p4 = new Product("789", "santoor soap", 20, 5);
		Product p5 = new Product("963", "Pears shower Gel", 560, 2);
		printTotalProducts();

	}

}
