package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures os triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double pX = (x.a + x.b + x.c)/2;
		double areaX = Math.sqrt(pX*(pX-x.a)*(pX-x.b)*(pX-x.c));
		
		double pY = (y.a + y.b + y.c)/2;
		double areaY = Math.sqrt(pY*(pY-y.a)*(pY-y.b)*(pY-y.c));
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else if(areaY > areaX) {
			System.out.println("Larger area: Y");
		}else {
			System.out.println("Area of X = Area of Y");
		}


		
		sc.close();

	}

}
