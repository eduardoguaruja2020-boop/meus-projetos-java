import java.util.Scanner;
import java.util.Locale;

public class impostoDeRenda {

	public static void main(String[] args) {
		
		double salario, valorAPagar;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário:");
		salario = sc.nextDouble();
		
		if(salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if(salario >= 2000.01 && salario <= 3000.00) {
			valorAPagar = (salario - 2000.00) * 8 / 100;
			System.out.printf("R$ %.2f", valorAPagar);
		}
		else if(salario >= 3000.01 && salario <= 4500.00) {
			valorAPagar = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
			System.out.printf("R$ %.2f", valorAPagar);
		}
		else if(salario > 4500.00) {
			valorAPagar = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
			System.out.printf("R$ %.2f", valorAPagar);
		}
		
		sc.close();
		
	}
	
}
