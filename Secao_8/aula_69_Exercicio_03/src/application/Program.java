package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas notas = new Notas();
		notas.name = sc.nextLine();
		notas.nota1 = sc.nextDouble();
		notas.nota2 = sc.nextDouble();
		notas.nota3 = sc.nextDouble();
		
		System.out.println(notas);
		sc.close();
	}

}
