import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		int num = 0;
		
		for(int i=0; i < entrada; i++) {
			int num1 = sc.nextInt();
			num += num1;
		}
		
		System.out.println("A SOMA É: " + num);
		sc.close();
	}

}
