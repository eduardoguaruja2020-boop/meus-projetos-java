import java.util.Scanner;

public class coordenadas {

	public static void main(String[] args) {
		int X, Y;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite duas coordenadas:");
		X = sc.nextInt();
		Y = sc.nextInt();

		while (X != 0 || Y != 0) {
			
			if (X > 0 && Y > 0) {			
				System.out.println("primeiro");
				
			} else if (X < 0 && Y > 0) {			
				System.out.println("segundo");
				
			} else if (X < 0 && Y < 0) {		
				System.out.println("terceiro");
				
			} else if (X > 0 && Y < 0) {	
				System.out.println("quarto");
				
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}
}
