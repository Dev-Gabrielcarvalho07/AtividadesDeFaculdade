/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Produto produto = new Produto("Limpol" , 25);

		System.out.println("=========Produto=========");
		produto.exibirInformacoes();
		produto.setpreco(2.99);
		System.out.println("O preço do produto é : " + produto.getpreco());
		produto.venderProduto(19);


	}
}
