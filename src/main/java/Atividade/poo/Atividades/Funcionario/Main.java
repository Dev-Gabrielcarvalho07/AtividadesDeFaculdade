/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Gerente gerente = new  Gerente ("Marcelo",7000 , 800 );
		Programador programador = new Programador("gabriel",15000 , 8);
		Estagiario estagiario = new Estagiario ("junior", 2000);

		System.out.println("SALARIOS DA EMPRESA:");
		System.out.println("======Gerente=====");
		gerente.calcularSalario();


		System.out.println("=====Programador=====");
		programador.calcularSalario();


		System.out.println("====Estagiario=====");
		estagiario.calcularSalario();
	}
}