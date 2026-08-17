import java.util.Scanner;

public class quadradoCubo {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
		}
		sc.close();
	}
}
