import java.util.Scanner;

public class multiplos {
	
	public static void main(String[]args) {
		
		int A,B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números");
		A = sc.nextInt();
		B = sc.nextInt();
				
		if(A % B == 0) {
			System.out.println("Sao Multiplos");
		}
		else if(B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
				
		sc.close();
		
	}
}
