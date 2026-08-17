import java.util.Scanner;

public class senhaInvalida {

	public static void main(String[] args) {

		int senha;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a senha:");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("SENHA INCORRETA, DIGITE NOVAMENTE");
			senha = sc.nextInt();
		}
		System.out.println("ACESSO PERMITIDO.");
		sc.close();
	}

}
