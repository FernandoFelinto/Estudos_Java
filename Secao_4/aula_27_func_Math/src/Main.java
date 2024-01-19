
public class Main {

	public static void main(String[] args) {
		double x = 3.0, y = 4.0, z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.printf("A raiz quadrada de %.1f = %.4f\n", x , A);
		System.out.println("A raiz quadrada de " + y + " = " + B);
		System.out.println("A raiz quadrada de 25.0 = " + C +"\n");
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.printf("%.1f elevado à %.1f = %.1f\n", x , y, A);
		System.out.println(x + " elevado à 2 = " + B);
		System.out.println("5 elevado à 2 = " + C +"\n");
		
		A = Math.abs(y); // faz o módulo do número (valor absoluto). Deixa-o sempre positivo
		B = Math.abs(z);
		System.out.println("O valor absoluto de " + y + " = " + A);
		System.out.println("O valor absoluto de " + z + " = " + B);


	}

}
