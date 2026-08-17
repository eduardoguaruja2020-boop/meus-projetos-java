package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class salary {

	public static void main(String[]args) {
		
		Employee employee;
		employee = new Employee();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your name: ");
		employee.name = sc.nextLine();
		System.out.print("\nType your gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("\nType the tax: ");
		employee.tax = sc.nextDouble();
		System.out.printf("Employe: %s, $ %.2f", employee.name, employee.NetSalary());
		System.out.print("\nWhich percentage to encrease salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.NetSalary());

		sc.close();
	}
}
