import java.util.Scanner;
import java.util.Locale;

public class areasFigurasGeometricas {
	
	public static void main(String[]args) {
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, raio;
		double pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A, B e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		
		raio = Math.pow(C, 2.0);
		circulo = pi * raio;
		
		trapezio = (A + B) * C / 2;
		
		quadrado = B * B;
		
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f", triangulo);
		System.out.printf("\nCIRCULO: %.3f", circulo);
		System.out.printf("\nTRAPEZIO: %.3f", trapezio);
		System.out.printf("\nQUADRADO: %.3f", quadrado);
		System.out.printf("\nRETANGULO: %.3f", retangulo);

		
		sc.close();
	}
	
}
