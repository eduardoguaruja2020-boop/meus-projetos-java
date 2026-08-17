package application;

import entities.Pessoa;
import java.util.Scanner;

public class pensionato {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] rooms = new int[10];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		int room = 0;
		Pessoa[] pessoa = new Pessoa[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			pessoa[i] = new Pessoa(name, email, room);
			rooms[i] = room;
		}
		System.out.println("Busy rooms: ");
		for(int i = 0; i < n; i++) {
			System.out.println(rooms[i] + ": " + pessoa[i].getNome() + ", " + pessoa[i].getEmail());
		}
		sc.close();
	}
}