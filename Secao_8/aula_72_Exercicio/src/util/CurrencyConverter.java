package util;

public class CurrencyConverter {
	public static double valorReais(double valorDolar, double quantDolares) {
		return (valorDolar * quantDolares) + ((valorDolar * quantDolares) * 0.06);
	}
}
