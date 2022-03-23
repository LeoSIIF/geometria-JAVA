package geometria;

public class Circulo {
	private double raio;
	private double pi = 3.1416;
	
//Métodos
	public void setLado(double raio) {
		if(raio>0) {
			this.raio = raio;
		}
	}
	public double CalculoArea() {
		double area;
		area = pi * raio * raio;
		return area;
	}
	public void desenhoCirculo() // dei uma olhada na internet
    {
        for (double i = -raio; i <= raio; i++) {
        for (double j = -raio; j <= raio; j++) {
        	if (i*i + j*j <= raio*raio) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }

}
