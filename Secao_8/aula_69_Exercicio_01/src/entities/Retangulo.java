package entities;

public class Retangulo {
	public double width;
	public double height;
	
	public double area(){
		return this.width * this.height;
	}
	
	public double perimeter() {
		return 2*(this.width + this.height);
	}
	
	public double diagonal() {
		return Math.sqrt((width*width)+(height*height));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) + "\nPERIMETER = " + String.format("%.2f", perimeter()) + "\nDIAGONAL = " + String.format("%.2f", diagonal());
	}
	
}
