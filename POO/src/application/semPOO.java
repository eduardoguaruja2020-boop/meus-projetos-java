package application;
import java.util.Scanner;
import java.util.Locale;

import entities.Triangle;

public class semPOO {
	public static void main(String[] args) {
		double txArea, tyArea;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		txArea = x.area();
		
		System.out.println("Enter the measures of triangle Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		tyArea = y.area();
		
		System.out.printf("Triangle X area: %.4f", txArea);
		System.out.printf("\nTriangle Y area: %.4f", tyArea);
		
		if(txArea > tyArea) {
			System.out.println("\nLarger area: X");
		} else {
			System.out.println("\nLarger area: Y");
		}
		
		sc.close();
	}
}
