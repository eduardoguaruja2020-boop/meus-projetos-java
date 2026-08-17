import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		int N, fat = 1;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			fat *= i;
		}
		System.out.println(fat);
		sc.close();
	}
}