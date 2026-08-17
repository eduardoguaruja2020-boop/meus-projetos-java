package application;

import entities.Sphere;
import java.util.Scanner;
import java.util.Locale;

public class radius {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sphere sphere = new Sphere();
		System.out.print("Enter radius: ");
		sphere.radius = sc.nextDouble();
		System.out.printf("Circumference: %.2f\nVolume: %.2f\nPI value: %.2f", sphere.Circumference(), sphere.Volume(), Sphere.PI);
		sc.close();
	}
}
