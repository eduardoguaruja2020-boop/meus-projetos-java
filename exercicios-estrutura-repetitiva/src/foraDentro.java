import java.util.Scanner;

public class foraDentro {
	public static void main(String[] args) {
		int N, X, i, in = 0, out = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor:");
		X = sc.nextInt();
		for (i = 0; i < X; i++) {
			N = sc.nextInt();
			if (N >= 10 && N <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}
}
