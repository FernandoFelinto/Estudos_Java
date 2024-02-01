package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); //quando o método é 'static', não é necessário instanciar um objeto
		double v = Calculator.volume(radius); //basta chamar a própria classe
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI);

		
		sc.close();
	}

}
