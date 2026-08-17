import java.util.Locale;
import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		
		double raio, area;
		double pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		
		raio = Math.pow(raio, 2.00);
		
		area = pi * raio;
		
		System.out.printf("O valor da área do círculo é: %.4f", area);
		
		sc.close();
		
	}

}
