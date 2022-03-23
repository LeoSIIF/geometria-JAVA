package geometria;

public class Triangulo {
	private double base;
	private double altura;
	
//Métodos
	public void setLado(double base, double altura) {
		if(base>0 && altura>0) {
			this.altura = altura;
			this.base = base;
		}
	}
	public double CalculoArea() {
		double area;
		area = (base * altura)/2;
		return area;
	}
	public void desenhoTriangulo() {
		
	        for (int i = 0; i < base; i++) {
	        for (int j = 0; j < i; j++)
	                System.out.print(". ");
	        for (int j = 0; j < altura-i; j++)
	                System.out.print("* ");
	            System.out.println();
	        }
	    }
	}
