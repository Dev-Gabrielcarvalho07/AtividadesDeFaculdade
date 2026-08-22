/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Filme filme = new Filme( "Avatar" , "gabriel", 2);
		Filme filme1 = new Filme("Ranbo");
		System.out.println("====Filme====");
		filme.exibirInformacoes();

		System.out.println("====Filme1====");

		filme1.exibirInformacoes();
	}
}