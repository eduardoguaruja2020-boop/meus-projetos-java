import java.util.Scanner;
import java.util.Locale;

public class mediaPonderada {

	public static void main(String[] args) {
		int X;
		double v1, v2, v3, media = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de testes que deseja fazer:");
		X = sc.nextInt();
		for (int i = 0; i < X; i++) {
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;
			System.out.printf("%.1f", media);
		}

		sc.close();
	}

}
