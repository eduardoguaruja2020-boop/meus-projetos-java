package Listas;

import java.util.ArrayList;

public class Exemplo1 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Anna");
		nomes.add("Carlos");
		nomes.add("João");
		nomes.add("Eduardo");
		nomes.add("Matheus");
		nomes.add("Heitor");
		
		System.out.println("Lista completa (formato padrão):");
		System.out.println(nomes);
		
		System.out.println("\nLista formatada com númeração:");
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println((i + 1) + " nome: " + nomes.get(i));
		}
		
		System.out.println("\nTotal de nomes na lista: " + nomes.size());
		

	}

}
