import java.util.Scanner;
import java.util.Locale;

public class soma_vetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.printf("\nSOMA = %.2f ", soma);

		double media = soma / n;

		System.out.printf("\nMEDIA = %.2f", media);
		sc.close();
	}
}
