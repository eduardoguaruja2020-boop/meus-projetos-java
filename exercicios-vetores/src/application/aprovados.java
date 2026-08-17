package application;

import entities.Aluno;
import java.util.Scanner;
import java.util.Locale;

public class aprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		Aluno[] aluno = new Aluno[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "o aluno:");
			String nome = sc.nextLine();
			System.out.print("Digite a primeira nota do " + (i + 1) + "o aluno:");
			double n1 = sc.nextDouble();
			System.out.print("Digite a segunda nota do " + (i + 1) + "o aluno:");
			double n2 = sc.nextDouble();
			sc.nextLine();
			double media = (n1 + n2) / 2;
			aluno[i] = new Aluno(nome, n1, n2, media);
		}
		System.out.print("Alunos aprovados: \n");
		for(int i = 0; i < n; i++) {
			if(aluno[i].getMedia() >= 6) {
				System.out.println(aluno[i].getNome());
			}
		}
		sc.close();
	}
}
