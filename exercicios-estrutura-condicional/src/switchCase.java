import java.util.Scanner;

public class switchCase {

	public static void main(String[]args) {
		
		int dia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor de 1 a 7");
		dia = sc.nextInt();
		
		switch(dia) {
			case 1:
				System.out.println("Hoje é DOMINGO");
				break;
			
			case 2:
				System.out.println("Hoje é SEGUNDA");
				break;
				
			case 3:
				System.out.println("Hoje é TERÇA");
				break;
				
			case 4:
				System.out.println("Hoje é QUARTA");
				break;
				
			case 5:
				System.out.println("Hoje é QUINTA");
				break;
				
			case 6:
				System.out.println("Hoje é SEXTA");
				break;
				
			case 7:
				System.out.println("Hoje é SÁBADO");
				break;
			default:
				System.out.println("Digite um número válido");
				break;
		}
		
		
		
		
		
		sc.close();
	}
	
}
