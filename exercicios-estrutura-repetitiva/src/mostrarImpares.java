import java.util.Scanner;

public class mostrarImpares {
	public static void main(String[]args) {
		int X, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		X = sc.nextInt();
		for(i = 1; i < X; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	sc.close();
	}
}
