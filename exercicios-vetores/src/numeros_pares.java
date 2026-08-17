import java.util.Scanner;

public class numeros_pares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int pares = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				pares += 1;
			}
		}
		System.out.print("NUMEROS PARES: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + "  ");
			}
		}
		System.out.print("\nQUANTIDADE DE PARES = " + pares);
		sc.close();
	}
}
