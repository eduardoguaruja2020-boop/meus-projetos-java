import java.util.Scanner;
import java.util.Locale;

public class abaixo_da_media {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter no vetor? ");
		int n = sc.nextInt();
		double media = 0;
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			media += vetor[i];
		}
		media /= n;
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		System.out.print("ELEMENTOS ABAIXO DA MEDIA: \n");
		for(int i = 0; i < n; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();
	}
}
