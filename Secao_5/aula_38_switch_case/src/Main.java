import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para o dia da semana: ");
		int num_dia = sc.nextInt();
		String dia;

		switch (num_dia) {
		case 1:
			dia = "Domingo!";
			break;
		case 2:
			dia = "Segunda-feira!";
			break;
		case 3:
			dia = "Terça-feira!";
			break;
		case 4:
			dia = "Quarta-feira!";
			break;
		case 5:
			dia = "Quinta-feira!";
			break;
		case 6:
			dia = "Sexta-feira!";
			break;
		case 7:
			dia = "Sábado!";
			break;
		default:
			dia = "[ERRO] Valor Inválido!";
			break;

		}

		System.out.println("O dia da semana é: " + dia);

		sc.close();

	}

}
