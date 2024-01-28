
public class Main {

	public static void main(String[] args) {
		/*
		 * toLowerCase() -> minúsculas
		 * toUpperCase() -> MAIÚSCULAS
		 * trim() -> remover espaços no começo e no fim
		 * substring(inicio, fim) -> recortar uma string; imprime a string a partir do parâmetro
		 * Replace('char'/"String",'char'/"String") -> substituir um pelo outro
		 * IndexOf / LastIndexOf -> buscar a posição de uma String
		 * str.Split(" ") -> recorta uma String de acordo com o separador desejado
		 * */
		
		String nome = "Luiz Fernando Bezerra Felinto";
		String ex01 = nome.toLowerCase();//letras minúsculas
		String ex02 = nome.toUpperCase();//letras MAIÚSCULAS
		String ex03 = nome.trim();//elimina os espaços no início e no fim
		String ex04 = nome.substring(2); //imprime a partir no indice 2
		String ex05 = nome.substring(2, 10); //imprime do indice 2 até o 9
		String ex06 = nome.replace('a', 'x');//troca onde tiver um 'a' por um 'x'
		String ex07 = nome.replace("Fernando", "Carlos");//troca a palavra por outra
		
		int i = nome.indexOf("nando");//retorna o index onde começa a string
		int j = nome.lastIndexOf("Fe");//retorna o index da última ocorrência
		
		String meuNome = "Luiz Fernando Bezerra Felinto";
		String[] vect = meuNome.split(" ");//separa a string por espaços " "
		String nome1 = vect[0];
		String nome2 = vect[1];
		String nome3 = vect[2];
		String nome4 = vect[3];
		
		System.out.println(ex01);
		System.out.println(ex02);
		System.out.println(ex03);
		System.out.println(ex04);
		System.out.println(ex05);
		System.out.println(ex06);
		System.out.println(ex07);
		System.out.println(i);
		System.out.println(j);

		
		System.out.println(nome1);
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println(nome4);



	}

}
