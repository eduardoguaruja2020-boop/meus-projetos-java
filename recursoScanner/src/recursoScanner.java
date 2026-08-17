import java.util.Locale;
import java.util.Scanner;

public class recursoScanner {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		/*
		 * sc.next() ------------> lê só a primeira palavra da variável string
		 * sc.nextInt() ---------> lê a variável do tipo inteiro
		 * sc.Double() ----------> lê a variável do tipo double
		 * sc.next().charAt(0) --> lê a variável char
		 * sc.nextLine() --------> lê até a quebra de linha (String)
		 **/
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
