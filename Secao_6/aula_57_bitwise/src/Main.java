
public class Main {

	public static void main(String[] args) {
		int n1 = 89; //em binário -> 0101 1001
		int n2 = 60; //em binário -> 0011 1100
		
		System.out.println(n1 & n2); // E
		System.out.println(n1 | n2); // OU
		System.out.println(n1 ^ n2); // OU exclusivo (quando apenas um for verdadeiro)

	}

}
