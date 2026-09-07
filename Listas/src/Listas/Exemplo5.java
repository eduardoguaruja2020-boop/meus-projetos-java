package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exemplo5 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(23, 1, 45, 6, 12));

		ArrayList<String> frutas = new ArrayList<>(
				Arrays.asList("banana", "maçã", "banana", "cereja", "maçã", "damasco"));

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

		System.out.println("Números após reverse: " + numeros);

		Collections.reverse(frutas);

		System.out.println("Frutas após reverse: " + frutas);

		System.out.println("\n=== Contando ocorrências ===");

		int ocorrenciasBanana = 0;

		for (String fruta : frutas) {
			if (fruta.equals("banana")) {
				ocorrenciasBanana++;
			}
		}

		System.out.println("Ocorrências de banana: " + ocorrenciasBanana);

		int ocorrenciasNumero6 = 0;

		for (int numero : numeros) {
			if (numero == 6) {
				ocorrenciasNumero6++;
			}
		}

		System.out.println("Ocorrências do número 6: " + ocorrenciasNumero6);

		System.out.println("\n=== Buscando indices ===");

		int indiceBanana = frutas.indexOf("banana");

		if (indiceBanana != -1) {
			System.out.println("Indice da primeira banana: " + indiceBanana);
		} else {
			System.out.println("'banana'não está na lista");
		}

		int indice23 = numeros.indexOf(23);
		
		if(indice23 != -1) {
			System.out.println("Indice do número 23: " + indice23);
		} else {
			System.out.println("23 não está na lista");
		}
		
		System.out.println("\n=== fim da demonstração dos métodos de listas ===");
		
	}

}
