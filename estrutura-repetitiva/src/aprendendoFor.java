import java.util.Scanner;

public class aprendendoFor {
	public static void main(String[] args) {
		int N, i, X, soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		X = sc.nextInt();
		for (i = 0; i < X; i++) {
			N = sc.nextInt();
			soma += N;
		}
		System.out.println(soma);

		sc.close();
	}
}