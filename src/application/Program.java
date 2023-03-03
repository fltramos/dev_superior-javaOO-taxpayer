package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> payers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char r = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if (r == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				payers.add(new Individual(name, income, health));
			}else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				payers.add(new Company(name, income, employees));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0;
		for(TaxPayer tax : payers) {
			System.out.println(tax.getName()+ ": $ " + (String.format("%.2f", tax.tax())));
			totalTaxes += tax.tax();
		}
		System.out.println();		
		System.out.println("TOTAL TAXES: " + (String.format("%.2f%n", totalTaxes)));
		
		sc.close();

	}

}
