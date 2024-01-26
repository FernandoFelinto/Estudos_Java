import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		class Temperatura{
			public static double fahrenheit(double celsius) {
				double F = (9*celsius / 5) + 32;
				return F;
			}
			
		}
		
		char repetir;
		do {
		System.out.print("Digite a temperatura em Celsius: ");
		double temperatura = sc.nextDouble();
		System.out.printf("O equivalente em Fahrenheit: %.1f °F\n", Temperatura.fahrenheit(temperatura));
		System.out.print("Deseja repetir (s/n)?");
		repetir = sc.next().charAt(0);
			
		}while(repetir != 'n');
		
		
		sc.close();

	}

}
