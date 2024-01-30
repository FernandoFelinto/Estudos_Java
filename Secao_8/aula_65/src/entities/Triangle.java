package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	
	public double area() { //não precisa receber parâmetro porque o 'A', 'B' e 'C' já estão na class
		double p = (a + b + c)/2.0;
		double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return result;
	}
}
