package lista_de_tarefas;

import java.util.Scanner;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== GERENCIADOR DE TAREFAS ===");

		int opcao = 0;

		ArrayList<String> tarefas = new ArrayList<>();

		String tarefa;

		do {

			System.out.println("1. Adicionar tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Remover tarefa");
			System.out.println("4. Sair");
			System.out.print("\nEscolha uma opção: ");

			opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {

				System.out.print("\nDigite a descrição da tarefa: ");

				tarefa = sc.nextLine();

				tarefas.add(tarefa);

			} else if (opcao == 2) {

				System.out.println(tarefas);

			} else if(opcao == 3) {
				
				System.out.println("Qual tarefa deseja remover?");
				
				System.out.println(tarefas);
				
				String remover = sc.nextLine();
				
				boolean foiRemovido = tarefas.removeIf(
						t -> t.trim().equalsIgnoreCase(remover.trim())
						);
				
				if(foiRemovido) {
					System.out.println("\nTarefa: " + remover + " foi removida com sucesso!");
					System.out.println("\nLista Atualizada de tarefas:");
					System.out.println("\n" + tarefas);
				}
				
			}

		} while (opcao != 4);

		sc.close();
		
	}
}
