/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	Circulo circulo = new Circulo (12);
	Quadrado quadrado = new Quadrado (20);
	Retangulo retangulo = new Retangulo (10 , 15);

	System.out.println("Calculos Áreas");

	System.out.println("===Circulo===");
	circulo.calcularArea();

	System.out.println("===Quadrado===");
	quadrado.calcularArea();

	System.out.println("===Retangulo===");
	retangulo.calcularArea();
	}
}
