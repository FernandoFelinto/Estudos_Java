package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f", funcionario.name , funcionario.netSalary());
		
		System.out.println("\nWhich percentage to increase salary? ");
		double percent = sc.nextDouble();
		System.out.printf("Updated data: %s, $ %.2f", funcionario.name, funcionario.increaseSalary(percent));
		sc.close();
	}

}
