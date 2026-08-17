package application;

import entities.Pessoa;
import java.util.Scanner;
import java.util.Locale;

public class dados_pessoas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double maiorAltura = 0;
		double menorAltura = 0;
		double somaAltMulheres = 0;
		int numHomens = 0;
		int numMulheres = 0;
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura, genero);
			if(genero == 'M') {
				numHomens++;
			}
			if(genero == 'F') {
				somaAltMulheres += altura;
				numMulheres++;
			}
			if(altura > maiorAltura) {
				maiorAltura = altura;
				menorAltura = altura;
			}
			if(altura < menorAltura) {
				menorAltura = altura;
			}

		}
		double mediaAltMulheres = somaAltMulheres / numMulheres;
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAltMulheres);
		System.out.print("Numero de homens = " + numHomens);
		sc.close();
	}
}
