package geometria;

public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(5);
		System.out.println("Area Quadrado: " + quadrado1.calculaArea());
		System.out.println("Desenho Quadrado: ");
		quadrado1.desenhoQuadrado();
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setLado(4,5);
		System.out.println("Area Retangulo: " + retangulo1.CalculoArea());
		System.out.println("Desenho Retangulo: ");
		retangulo1.desenhoRetangulo();
		
		
		Circulo circulo1 = new Circulo();
		circulo1.setLado(6);
		System.out.println("Area Circulo: " + circulo1.CalculoArea());
		System.out.println("Desenho Circulo: ");
		circulo1.desenhoCirculo();
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setLado(10,10);
		System.out.println("Area Triangulo: " + triangulo1.CalculoArea());
		System.out.println("Desenho Triangulo: ");
		triangulo1.desenhoTriangulo();
	}

}
