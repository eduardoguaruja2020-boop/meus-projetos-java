import java.util.Scanner;

public class aprendendoWhile {

	public static void main(String[] args) {
		
		int num, soma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número (ou 0 para encerrar a execução)");
		num = sc.nextInt();
				
		while(num != 0) {
			
			soma += num;
			
			System.out.println("Digite outro número (ou 0 para encerrar a execução)");
			num = sc.nextInt();
		}
		
		System.out.println("A soma dos números digitados é: 5" + soma);
		
		sc.close();
	}

}
