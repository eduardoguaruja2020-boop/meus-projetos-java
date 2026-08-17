import java.util.Scanner;

public class media_pares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int soma = 0;
		double media = 0;
		int qtdPares = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				qtdPares++;
			}
		}
		if (soma != 0) {
			media = soma / qtdPares;
			System.out.print("MEDIA DOS PARES = " + media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}
}
