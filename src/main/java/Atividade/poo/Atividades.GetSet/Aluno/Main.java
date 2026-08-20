/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("gabriel" ,"Curso superior");
		Aluno aluno2 = new Aluno("Rafael" , "Curso técnico");
		System.out.println("=========Aluno1========");
		aluno1.exibirDados();
		aluno1.setIdade(19);
		System.out.println("idade do  Aluno: "  +  aluno1.getIdade()  +  " Anos " );

		System.out.println("=========Aluno2========");
		aluno2.exibirDados();
		aluno2.setIdade(36);
		System.out.println("idade do  Aluno: "  + aluno2.getIdade()  +  " Anos ");


	}
}
