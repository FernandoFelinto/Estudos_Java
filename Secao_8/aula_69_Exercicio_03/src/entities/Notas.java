package entities;

public class Notas {
	public double nota1, nota2, nota3;
	public String name;
	
	public double media() {
		return nota1 + nota2 + nota3;
	}
	
	public boolean validacaoNotas() {
		if((nota1 >= 0 && nota1 <=30) && (nota2 >=0 && nota2 <=35) && (nota3 >=0 && nota3 <=35)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		if(validacaoNotas() == true) {
			if(media() >= 60) {
				return name + "\nFINAL GRADE = " + String.format("%.2f", media()) + "\nPASS";
			}else {
				return name + "\nFINAL GRADE = " + String.format("%.2f", media()) + "\nFAILED\nMISSING " + String.format("%.2f", (60 - media())) + " POINTS";
			}
		}else {
			return "Notas Inválidas!";
		}
	}
}
