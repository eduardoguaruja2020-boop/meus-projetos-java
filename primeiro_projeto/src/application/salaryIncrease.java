package application;

import entities.Employee;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class salaryIncrease {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		System.out.println("Enter the employee that will have salary increase: ");
		int increaseId = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == increaseId).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		for(Employee e : list) {
			System.out.println(e);
		}
		sc.close();
	}
}
