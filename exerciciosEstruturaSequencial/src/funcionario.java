import java.util.Locale;
import java.util.Scanner;

public class funcionario {
	
	public static void main(String[] args) {
		int NUMBER, horas;
		double valPorHora, SALARY;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário: ");
		NUMBER = sc.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Digite o valor recebido por hora: ");
		valPorHora = sc.nextDouble();
		
		SALARY = valPorHora * horas;
		
		System.out.printf("\nNUMBER = %d", NUMBER);
		System.out.printf("\nSALARY = U$ %.2f", SALARY);
		
		sc.close();
	}
}
