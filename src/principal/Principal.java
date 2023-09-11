package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;






public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<TaxPayer> taxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			
			
			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				taxPayer.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				taxPayer.add(new Company(name, anualIncome, numberOfEmployees));
				}
			}
			
			System.out.println();
			System.out.println("TAXES PAID: ");
			
			Double tt = 0.0;
			for (TaxPayer tp : taxPayer) {
				System.out.println(tp.getName() + String.format(" R$ %.2f", tp.tax()));
				tt += tp.tax();
			}
			
			System.out.println();
			System.out.printf("TOTAL TAXES: R$ %.2f", tt);
			
			sc.close();
		
	}

}
