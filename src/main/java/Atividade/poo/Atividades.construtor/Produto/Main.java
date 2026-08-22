/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {

		Produto produto = new Produto( "SSD  m2 256gb" , 185 , 7 );
		Produto produto1 = new Produto("HD 500gb", 155 , 1  );

		System.out.println("====Produto====");
		produto.exibirInformacoes();

		System.out.println("====Produto1====");
		produto1.exibirInformacoes();
	}
}