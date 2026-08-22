/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Livro livro = new Livro("Senai", "Gylles" ,0 );
		Livro livro1 = new  Livro("Fatesg" );

		System.out.println("====LIVRO====");

		livro.ExibirInformacoes();

		System.out.println("====LIVRO 1====");

		livro1.ExibirInformacoes();
	}
}