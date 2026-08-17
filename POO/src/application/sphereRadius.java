package application;

import util.Calculator;
import java.util.Scanner;
import java.util.Locale;

public class sphereRadius {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f", c);
		System.out.printf("\nVolume: %.2f", v);
		System.out.printf("\nPI value: %.2f", Calculator.PI);

		sc.close();
	}
}
