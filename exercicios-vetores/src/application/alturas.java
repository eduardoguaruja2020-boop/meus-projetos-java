package application;

import entities.Pessoa;
import java.util.Scanner;
import java.util.Locale;

public class alturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoa = new Pessoa[n];
		for (int i = 0; i < pessoa.length; i++) {
			System.out.print("Dados da " + (i + 1) + "a pessoa");
			System.out.print("\nNome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		double soma = 0;
		for (int i = 0; i < pessoa.length; i++) {
			soma += pessoa[i].getAltura();
		}
		double media = soma / n;
		System.out.printf("Altura média: %.2f\n", media);

		double menos16 = 0;
		soma = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				soma += 1;
			}
		}
		menos16 = soma / n * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f %%\n", menos16);
		for (int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		sc.close();
	}
}
