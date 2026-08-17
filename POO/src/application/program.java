package application;

import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int qttInStock = sc.nextInt();
		
		Product product = new Product(name, price, qttInStock);
				
		System.out.println("Product data: " + product.toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int add = sc.nextInt();
		product.addProducts(add);
		
		System.out.println("Updated product data: " + product.toString());

		System.out.print("\nEnter the number of products to be removed in stock: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		
		System.out.println("Updated product data: " + product.toString());
	
		sc.close();
	}
}