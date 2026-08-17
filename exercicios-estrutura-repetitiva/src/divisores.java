import java.util.Scanner;

public class divisores {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
