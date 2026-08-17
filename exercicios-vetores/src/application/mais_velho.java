package application;

import entities.Pessoa;

import java.util.Scanner;

public class mais_velho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		int maiorIdade = 0;
		String velhoNome = "";
		Pessoa[] pessoa = new Pessoa[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Dados da " + (i + 1) + "a pessoa: \n");
			System.out.print("Nome: \n");
			String nome = sc.next();
			System.out.print("Idade: \n");
			int idade = sc.nextInt();
			pessoa[i] = new Pessoa(nome, idade);
			if (pessoa[i].getIdade() > maiorIdade) {
				maiorIdade = pessoa[i].getIdade();
				velhoNome = pessoa[i].getNome();
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + velhoNome);
		sc.close();
	}
}
