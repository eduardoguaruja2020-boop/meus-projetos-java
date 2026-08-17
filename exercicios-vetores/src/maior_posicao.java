import java.util.Scanner;
import java.util.Locale;

public class maior_posicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double maiorValor = 0;
		int posicao = 0;
		double[] vetor = new double[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}
		System.out.print("MAIOR VALOR: " + maiorValor);
		System.out.print("\nPOSICAO DO MAIOR VALOR: " + posicao);
		sc.close();
	}
}
