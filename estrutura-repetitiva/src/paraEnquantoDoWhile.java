import java.util.Scanner;
import java.util.Locale;

public class paraEnquantoDoWhile {
	public static void main(String[] args) {
		double cel, far;
		char escolha;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite a temperatura em Celsius");
			cel = sc.nextDouble();
			far = 9 * cel / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f", far);
			System.out.println("\nDeseja repetir? (s/n)");
			escolha = sc.next().charAt(0);
		} while(escolha == 's');
		if(escolha == 'n') {
			System.out.println("Programa Encerrado.");
		}
		sc.close();
	}
}