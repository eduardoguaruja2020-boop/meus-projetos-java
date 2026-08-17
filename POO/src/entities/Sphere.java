package entities;

public class Sphere {
	public double radius;
	public static final double PI = 3.14159;
	
	public double Circumference() {
		return 2 * PI * radius;
	}
	
	public double Volume() {
		return 4 * PI * Math.pow(radius, 3) / 3;
	}
}
