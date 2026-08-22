/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Aluno aluno = new Aluno ("gabriel", 22 , "Engênharia de software");
		Aluno aluno1 = new Aluno("Julio" , "ADS");

		System.out.println("===Aluno===");
		aluno.exibirInformacoes();

		System.out.println("===Aluno1===");
		aluno1.exibirInformacoes();
	}
}