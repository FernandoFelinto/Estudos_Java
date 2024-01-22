import java.util.Locale;
import java.util.Scanner;

public class Main {

	class Condicional {
		public static String multiplos(int num1, int num2) {
			if (num1 >= num2) {
				if (num1 % num2 == 0) {
					String resultado = "Sao Multiplos";
					return resultado;
				} else {
					String resultado = "Nao sao Multiplos";
					return resultado;
				}
			} else {
				if (num2 % num1 == 0) {
					String resultado = "Sao Multiplos";
					return resultado;
				} else {
					String resultado = "Nao sao Multiplos";
					return resultado;
				}
			}
		}

		public static int duracaoJogo(int inicio, int fim) {
			int duracao;
			if (inicio < fim) {
				duracao = fim - inicio;
				return duracao;
			} else {
				duracao = 24 - inicio + fim;
				return duracao;
			}
		}

		public static double restaurante(int cod, int quant) {
			double preco;
			switch (cod) {
			case 1:
				preco = quant * 4;
				return preco;
			case 2:
				preco = quant * 4.5;
				return preco;
			case 3:
				preco = quant * 5;
				return preco;
			case 4:
				preco = quant * 2;
				return preco;
			case 5:
				preco = quant * 1.5;
				return preco;
			default:
				return 0;
			}
		}

		public static String intervaloZeroCem(double num) {

			if (num >= 0 && num <= 25) {
				return "Intervalo [0, 25]";
			} else if (num > 25 && num <= 50) {
				return "Intervalo (25, 50]";
			} else if (num > 50 && num <= 75) {
				return "Intervalo (50, 75]";
			} else if (num > 75 && num <= 100) {
				return "Intervalo (75, 100]";
			} else {
				return "Fora do intervalo";
			}

		}

		public static String quadrante(double x, double y) {
			if (x > 0 && y > 0) {
				return "Q1";
			} else if (x < 0 && y > 0) {
				return "Q2";
			} else if (x < 0 && y < 0) {
				return "Q3";
			} else if (x > 0 && y < 0) {
				return "Q4";
			} else {
				return "Origem";
			}
		}

		public static void calcularImposto(double salario) {
			double imposto = 0.0;
			if (salario <= 2000) {
				// return imposto;
				System.out.println("Isento");
			} else if (salario <= 3000) {
				imposto = (salario - 2000) * 0.08;
				System.out.printf("R$ %.2f", imposto);
				// return imposto;
			} else if (salario <= 4500) {
				imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
				// return imposto;
				System.out.printf("R$ %.2f", imposto);
			} else if (salario > 4500) {
				imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
				System.out.printf("R$ %.2f", imposto);
			}

		}

	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 ****** EXERCÍCIO 01 ****** Fazer um programa para ler um número inteiro, e depois
		 * dizer se este número é negativo ou não.
		 */

		int num1 = sc.nextInt();
		String negativo = (num1 >= 0) ? "NAO NEGATIVO" : "NEGATIVO"; // estrutura condicional ternária
		System.out.println(negativo);

		/*
		 ****** EXERCÍCIO 02 ****** Fazer um programa para ler um número inteiro e dizer se
		 * este número é par ou ímpar.
		 */

		int num2 = sc.nextInt();
		String parImpar = (num2 % 2 == 0) ? "PAR" : "IMPAR";
		System.out.println(parImpar);

		/*
		 ****** EXERCÍCIO 03 ****** Leia 2 valores inteiros (A e B). Após, o programa deve
		 * mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os
		 * valores lidos são múltiplos entre si. Atenção: os números devem poder ser
		 * digitados em ordem crescente ou decrescente.
		 */

		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		System.out.println(Condicional.multiplos(num3, num4));

		/*
		 ****** EXERCÍCIO 04 ****** Leia a hora inicial e a hora final de um jogo. A seguir
		 * calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e
		 * terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		System.out.printf("O JOGO DUROU %d HORA(S)", Condicional.duracaoJogo(inicio, fim));

		/*
		 ****** EXERCÍCIO 05 ****** Com base na tabela abaixo, escreva um programa que leia o
		 * código de um item e a quantidade deste item. A seguir, calcule e mostre o
		 * valor da conta a pagar.
		 */

		int cod = sc.nextInt();
		int quant = sc.nextInt();
		System.out.printf("Total: R$ %.2f", Condicional.restaurante(cod, quant));

		/*
		 ****** EXERCÍCIO 06 ****** Você deve fazer um programa que leia um valor qualquer e
		 * apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25],
		 * (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não
		 * estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de
		 * intervalo”.
		 */

		double num5 = sc.nextDouble();
		System.out.println(Condicional.intervaloZeroCem(num5));

		/*
		 ****** EXERCÍCIO 07 ****** Leia 2 valores com uma casa decimal (x e y), que devem
		 * representar as coordenadas de um ponto em um plano. A seguir, determine qual
		 * o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
		 * cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a
		 * mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou
		 * “Eixo Y”, conforme for a situação.
		 */

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.println(Condicional.quadrante(x, y));

		/*
		 ****** EXERCÍCIO 08 ***** Em um país imaginário denominado Lisarb, todos os
		 * habitantes ficam felizes em pagar seus impostos, pois sabem que nele não
		 * existem políticos corruptos e os recursos arrecadados são utilizados em
		 * benefício da população, sem qualquer desvio. A moeda deste país é o Rombus,
		 * cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao
		 * salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que
		 * esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 */
		double salario = sc.nextDouble();
		Condicional.calcularImposto(salario);

		sc.close();
	}

}
