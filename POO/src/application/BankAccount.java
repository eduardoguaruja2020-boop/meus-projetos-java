package application;

import entities.Holder;
import java.util.Scanner;
import java.util.Locale;

public class BankAccount {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Holder holder = new Holder();
		System.out.print("Enter account number: ");
		int acNumber = sc.nextInt();
		sc.nextLine();
		holder.setAccountNumber(acNumber);
		System.out.print("Enter account holder: ");
		String holderName = sc.nextLine();
		holder.setName(holderName);

		System.out.print("Is there an initial deposit (y/n)?");
		char answer = sc.next().charAt(0);
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double iDeposit = sc.nextDouble();
			holder.initialDeposit(iDeposit);
			System.out.printf("Account data: ");
			System.out.printf(
					"\nAccount: " + holder.getAccountNumber() + ", Holder: " + holder.getName() + ", Balance: %.2f",
					holder.getInitialBalance());
		} else if (answer == 'n') {
			System.out.printf("Account data: ");
			System.out.printf(
					"\nAccount: " + holder.getAccountNumber() + ", Holder: " + holder.getName() + ", Balance: %.2f",
					holder.getInitialBalance());
		}

		System.out.print("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		holder.deposit(deposit);
		System.out.printf("\nUpdated account data: ");
		System.out.printf("\nAccount: " + holder.getAccountNumber() + ", Holder: " + holder.getName() + ", Balance: %.2f",
				holder.getInitialBalance());

		System.out.print("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		holder.withdraw(withdraw);
		System.out.printf("\nUpdated account data: ");
		System.out.printf("\nAccount: " + holder.getAccountNumber() + ", Holder: " + holder.getName() + ", Balance: %.2f",
				holder.getInitialBalance());
		sc.close();
	}
}
