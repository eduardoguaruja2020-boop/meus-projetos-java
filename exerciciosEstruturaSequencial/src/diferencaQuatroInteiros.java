import java.util.Scanner;

public class diferencaQuatroInteiros {
	
	public static void main(String[]args) {
		
		int A, B, C, D, DIFERENCA;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 números INTEIROS: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("A diferença dos produtos de A e B pelo produto de C e D é:" + DIFERENCA);
		
		sc.close();
		
	}
	
}
