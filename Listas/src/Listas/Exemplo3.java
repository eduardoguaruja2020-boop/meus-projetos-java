package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo3 {

	public static void main(String[] args) {
		
		System.out.println("=== Criando e acessando listas em Java ===\n");
		
		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		
		System.out.println("Lista de números: " + numeros);
		
		ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Cereja"));
		
		System.out.println("Lista de frutas: " + frutas);

		ArrayList<Object> listaMista = new ArrayList<>();
	
		listaMista.add(10);
		listaMista.add("Olá");
		listaMista.add(2.5);
		listaMista.add(new ArrayList<>(Arrays.asList("a", "b")));
		listaMista.add(true);
		
		System.out.println("Lista mista: " + listaMista);
		
		ArrayList<String> frutas2 = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Cereja", "Damasco"));
		
		System.out.println("\nPrimeira fruta: " + frutas2.get(0));
		System.out.println("\nTerceira fruta: " + frutas2.get(2));
		
		int tamanho = frutas2.size();
		
		System.out.println("\nUltima fruta (tamanho - 1): " + frutas2.get(tamanho - 1));
		System.out.println("\nPenultima fruta (tamanho - 1): " + frutas2.get(tamanho - 2));

	}

}
