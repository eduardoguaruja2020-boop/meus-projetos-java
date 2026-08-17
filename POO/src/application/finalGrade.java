package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class finalGrade {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student;;
		student = new Student();
		student.name = sc.nextLine();
		student.t1 = sc.nextDouble();
		student.t2 = sc.nextDouble();
		student.t3 = sc.nextDouble();
		System.out.printf("FINAL GRADE = %.2f", student.finalGrade());
		student.situation();
		sc.close();
	}
}
