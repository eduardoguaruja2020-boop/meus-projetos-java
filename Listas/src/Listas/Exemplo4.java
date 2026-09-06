package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo4 {

	public static void main(String[] args) {

		System.out.println("=== 1. Adicionar elementos ===");

		ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maça", "Banana"));

		frutas.add("Cereja");

		System.out.println("add (append): " + frutas);

		frutas = new ArrayList<>(Arrays.asList("maça", "banana", "cereja"));

		frutas.add(1, "abacate");

		System.out.println("add (index, valor) (insert): " + frutas);

		System.out.println("\n=== 2. Remover elementos ===");

		frutas = new ArrayList<>(Arrays.asList("maça", "banana", "cereja"));

		frutas.remove("banana");

		System.out.println("Remove (valor): " + frutas);

		frutas = new ArrayList<>(Arrays.asList("maça", "banana", "cereja"));

		frutas.remove(1);

		System.out.println("Remove (index): " + frutas);
		
		frutas.remove(frutas.size() - 1);
		
		System.out.println("Remove último: " + frutas);

		System.out.println("\n=== 3. Concatenar Listas ===");
		
		ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(4, 5, 6));
		
		ArrayList<Integer> uniao = new ArrayList<>(lista1);
		
		uniao.addAll(lista2);
		
		System.out.println("Concatenação (+ / extend): " + uniao);
		
		lista1 = new ArrayList<>(Arrays.asList(1, 2, 3));
		lista2 = new ArrayList<>(Arrays.asList(4, 5, 6));
	
		lista1.addAll(lista2);
		
		System.out.println("addAll (extend): " + lista1);
	
		System.out.println("\n=== 4. Repetir Listas ===");
		
		ArrayList<String> repeticao = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			repeticao.add("a");
			repeticao.add("b");
		}
		
		System.out.println("repetição manual: " + repeticao);
		
		System.out.println("\n=== 5. Verificar se um item está na lista ===");
		
		frutas = new ArrayList<>(Arrays.asList("maçã", "banana", "cereja"));
		
		System.out.println("Contém 'banana'? " + frutas.contains("banana"));
		
		System.out.println("Contém 'uva'? " + frutas.contains("uva"));
		
		System.out.println("\n=== FIM das operações ===");

	}

}
