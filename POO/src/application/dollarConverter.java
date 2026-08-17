package application;

import util.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class dollarConverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Whats the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How manny dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		double amount = CurrencyConverter.Converter(dollarPrice, dollarAmount);
		System.out.printf("Aomount to be paid in reais = %.2f", amount);
		sc.close();
	}
}
