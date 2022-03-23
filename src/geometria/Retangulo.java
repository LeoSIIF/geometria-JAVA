package geometria;

public class Retangulo {
	
	private double base; 
	private double altura; 
	//Metódos 
	public void setLado(double base,double altura) {
		if(base>0 && altura>0) {
			this.altura = altura;
			this.base = base;
		}
	}
	public double CalculoArea() {
		double area;
		area = base * altura;
		return area;
	}
	public void desenhoRetangulo() {
		for(int i=0; i<base; i++) {
			System.out.print(".");
			for(int j=0; j<altura; j++) {
				if(i==0 || i+1>= base) {
					System.out.print(". ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(".");
		}
	}
}

