import java.util.Scanner;

public class exercicioTelefonia {

	public static void main(String[]args) {
		
		int minutos, exc;
		double valorAPagar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos que você consumiu:");
		minutos = sc.nextInt();
		
		if(minutos <= 100) {
			valorAPagar = 50;
			System.out.printf("Valor a pagar: R$ %.2f",valorAPagar);
		}
		else if(minutos > 100) {
			exc = minutos - 100;
			valorAPagar = exc * 2 + 50;
			System.out.printf("Valor a pagar: R$ %.2f",valorAPagar);
		}
		
		sc.close();
		
		
	}
	
}
