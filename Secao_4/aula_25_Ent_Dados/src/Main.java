import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ********************* PARTE 1 *******************************

		Locale.setDefault(Locale.US); // se importar o Lacale antes do Scanner tem que digitar os números com o
										// ponto(.)

		Scanner sc = new Scanner(System.in); // iniciar para fazer entrada de dados

		
		 
		String nome;
		System.out.print("Digite um nome: ");
		nome = sc.next(); // para ler uma String

		int num;
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt(); // para ler inteiros

		double num2;
		System.out.print("Digite um número float: ");
		num2 = sc.nextDouble(); // para ler float OBS: Se não colocar o 'Locale.US' tem que digitar com ','

		char letra;
		System.out.print("Digite uma letra: ");
		letra = sc.next().charAt(0);// pega o primeiro caracter da String, scaneia um caracter

		System.out.printf("O nome digitado foi: %s e o número inteiro foi: %d\n", nome, num);
		System.out.printf("O número float é: %.2f\n", num2); // o printf imprime com a vírgula (,)
		System.out.println("O número float é: " + num2); // o println imprime com o ponto (.)
		System.out.println("O caracter é: " + letra);

		
		
		// ********************* PARTE 2 *******************************
		int num3;
		String s1, s2, s3;
		num3 = sc.nextInt();
		sc.nextLine(); //consome a quebra de linha causada pelo nextInt(), limpa o buffer
		s1 = sc.nextLine(); //armazena na variável o que você digitar, até apertar o ENTER
		s2 = sc.nextLine(); // sc.next() -> armazena uma palavra
		s3 = sc.nextLine(); // sc.nextLine() -> Armazena uma linha (Ex: Um nome completo de alguém)
		
		System.out.println("Dados Digitados:");
		System.out.println(num3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
		sc.close(); // encerrar o scanner
	}

}
