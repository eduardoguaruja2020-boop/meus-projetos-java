import java.util.Scanner;
import java.util.Locale;

public class peca {
	
	public static void main(String[]args) {
		
		int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
		double valPeca1, valAPagar1, valPeca2, valAPagar2;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da peça 1, a quantidade de peças 1 e o valor unitário de cada peça 1: ");
		codPeca1 = sc.nextInt();	
		qtdPeca1 = sc.nextInt();
		valPeca1 = sc.nextDouble();
		
		valAPagar1 = valPeca1 * qtdPeca1;
		
		System.out.println("Digite o código da peça 2, a quantidade de peças 2 e o valor unitário de cada peça 2: ");
		codPeca2 = sc.nextInt();	
		qtdPeca2 = sc.nextInt();
		valPeca2 = sc.nextDouble();
		
		valAPagar2 = valPeca2 * qtdPeca2;
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f", valAPagar1 + valAPagar2);
		
		sc.close();
	}
}
