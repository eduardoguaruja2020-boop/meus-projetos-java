import java.util.Scanner;

public class exercicioSoma {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.printf("A soma dos números digitados é: %d", soma);
		
		sc.close();
	}
}
