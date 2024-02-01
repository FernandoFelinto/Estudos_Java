package util;

public class Calculator {
	public final double PI = Math.PI;
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
	}
}
