package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exemplo5 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(23, 1, 45, 6, 12));

		ArrayList<String> frutas = new ArrayList<>(Arrays.asList(
			"banana",
			"maçã",
			"banana",
			"cereja",
			"maçã",
			"damasco"
		));
		
		System.out.println("=== Lista original de números ===");
		
		System.out.println(numeros);
		
		Collections.sort(numeros);
		
		System.out.println("\nNúmeros ordenados (crescente): " + numeros);

		System.out.println("\n=== Lista original de frutas ===");
		
		System.out.println(frutas);
		
		Collections.sort(frutas);
		
		System.out.println("Frutas ordenadas (ordem alfabética): " + frutas);
		
		Collections.sort(numeros, Collections.reverseOrder());
		
		System.out.println("\nNúmeros ordenados (ordem decrescente): " + numeros);
		
		System.out.println("\n=== Invertendo a ordem ===");
		
		Collections.reverse(numeros);
		
		System.out.println("Números");
	}

}
