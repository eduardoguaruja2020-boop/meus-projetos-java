package primeiro_projeto;

import java.util.Scanner;

public class funcoesSintaxe {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		int higher = max(num1, num2, num3);

		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
}
