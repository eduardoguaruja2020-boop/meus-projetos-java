import java.util.Scanner;

public class tabelaItens {

	public static void main(String[]args) {
		
		int codigo, qtd;
		double total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE O CÓDIGO DO ITEM E A QUANTIDADE");
		System.out.println("\n CODIGO     ESPECIFICAÇÃO     PREÇO   ");
		System.out.println("   1       CACHORRO QUENTE   R$4.00   ");
		System.out.println("   2          X SALADA       R$4.50   ");
		System.out.println("   3          X BACON        R$5.00   ");
		System.out.println("   4       TORRADA SIMPLES   R$2.00   ");
		System.out.println("   5        REFRIGERANTE     R$1.50   ");
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		if(codigo == 1){
			total = qtd * 4;
		}
		else if(codigo == 2) {
			total = qtd * 4.50;
		}
		else if(codigo == 3) {
			total = qtd * 5;
		}
		else if(codigo == 4) {
			total = qtd * 2;
		}
		else if(codigo == 5) {
			total = qtd * 1.50;
		}
		System.out.printf("\nTotal: R$ %.2f", total);

		sc.close();
		
	}
	
}
