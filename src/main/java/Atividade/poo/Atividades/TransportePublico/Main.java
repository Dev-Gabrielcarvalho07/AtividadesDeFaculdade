/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    Onibus onibus = new Onibus (12 , 256);
	    Trem trem = new Trem (33 , 128);
	    System.out.println("TRANSPORTE PUBLICO:");

	    System.out.println("====Onibus====");
		System.out.println(" Tarifa Onibus "  +   onibus.calcularTarifa());

		System.out.println("====Trem====");
		System.out.println(" Tarifa Trem "  +  trem.calcularTarifa());
	}
}