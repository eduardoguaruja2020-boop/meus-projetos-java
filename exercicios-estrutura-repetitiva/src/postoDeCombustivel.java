import java.util.Scanner;

public class postoDeCombustivel {

	public static void main(String[] args) {
		int alc = 0, gas = 0, die = 0, esc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual foi o tipo de combustivel abastecido?");
		System.out.println("|1-Álcool| |2-Gasolina| |3-Diesel| |4-Fim|");
		esc = sc.nextInt();
		while (esc != 4) {
			if (esc == 1) {
				alc += 1;
			} else if (esc == 2) {
				gas += 1;
			} else if (esc == 3) {
				die += 1;
			}
			esc = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", alc, gas, die);
		sc.close();
	}
}
