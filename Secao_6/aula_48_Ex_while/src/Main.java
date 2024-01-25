import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	class Enquanto {
		public static String quadrante(double x, double y) {
			if (x > 0 && y > 0) {
				return "primeiro";
			} else if (x < 0 && y > 0) {
				return "segundo";
			} else if (x < 0 && y < 0) {
				return "terceiro";
			} else if (x > 0 && y < 0) {
				return "quarto";
			} else {
				return "";
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 ****** EXERCÍCIO 01 ****** Escreva um programa que repita a leitura de uma senha até
		 * que ela seja válida. Para cada leitura de senha incorreta informada, escrever
		 * a mensagem "Senha Invalida". Quando a senha for informada corretamente deve
		 * ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere
		 * que a senha correta é o valor 2002.
		 */
		/*
		   int senha = sc.nextInt(); while(senha != 2002) {
		   System.out.println("Senha Inválida"); senha = sc.nextInt(); }
		   System.out.println("Acesso Permitido");
		 */

		/*
		 ****** EXERCÍCIO 02 ****** Escreva um programa para ler as coordenadas (X,Y) de uma
		 * quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto
		 * escrever o quadrante a que ele pertence. O algoritmo será encerrado quando
		 * pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
		 * mensagem alguma).
		 */
		/*
		boolean enquanto = true;
		while (enquanto) {
			String linha1 = sc.nextLine(); // lê a linha
			String[] dados1 = linha1.split(" ");// separa a linha nos espaços " "
			ArrayList<String> lista1 = new ArrayList();// cria uma nova lista

			for (String dad1 : dados1) { // cada dado que foi separado vai ser adcionado à lista
				lista1.add(dad1);
			}

			double total1 = (Double.valueOf(lista1.get(0)).doubleValue()); // transforma o dado(0) da lista em double
			if (total1 == 0) {
				enquanto = false;
			}
			double total2 = (Double.valueOf(lista1.get(1)).doubleValue());// transforma o dado(1) da lista em double
			if (total2 == 0) {
				enquanto = false;
			}
			System.out.println(Enquanto.quadrante(total1, total2));

		}
		*/
		
		/*
		 ****** EXERCÍCIO 03 ******
		 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		 um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		 que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		 mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		 exemplo. 
		*/
		boolean posto = true;
		int contAlcool = 0, contGasolina = 0, contDiesel = 0;
		
		while(posto){
		int leitura = sc.nextInt();
			if(leitura != 4) {
				if(leitura == 1) {
					contAlcool += 1;
				}else if(leitura == 2) {
					contGasolina += 1;
				}else if(leitura == 3) {
					contDiesel += 1;
				}
			}else {
				posto = false;
			}
		
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", contAlcool, contGasolina, contDiesel);
		
		
		

		sc.close();

	}

}
