import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int higher = maior(num1, num2, num3);
		showResult(higher);
		
		sc.close();
	}
	
	public static int maior(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	

}
