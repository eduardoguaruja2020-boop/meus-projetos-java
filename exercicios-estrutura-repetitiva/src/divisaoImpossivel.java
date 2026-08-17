import java.util.Scanner;
import java.util.Locale;

public class divisaoImpossivel {
	public static void main(String[] args) {
		int N;
		double div, n1, n2;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de pares que deseja dividir");
		N = sc.nextInt();
		System.out.printf("Agora digite %d pares de números:", N);
		for (int i = 0; i < N; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			if (n2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				div = n1 / n2;
				System.out.printf("%.1f", div);
			}
		}
		sc.close();
	}
}
