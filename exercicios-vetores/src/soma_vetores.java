import java.util.Scanner;

public class soma_vetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter em cada vetor? ");
		int n = sc.nextInt();
		int[] vetorA = new int[n];
		System.out.print("Digite os valores do vetor A: \n");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		System.out.print("Digite os valores do vetor B: \n");
		int[] vetorB = new int[n];
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		int[] vetorResultante = new int[n];
		System.out.print("VETOR RESULTANTE: \n");
		for(int i = 0; i < vetorResultante.length; i++) {
			vetorResultante[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorResultante[i]);
		}
		sc.close();
	}
}
