/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[]args){
        Livro livro =  new Livro ("Lendas do Futebol", 578 );
        Livro livro1 =  new Livro ("Cronicas de narnia",  275);

        System.out.println("=====Livro1====");
        livro.exibirInformacoes();
        livro.setAutor("gabriel");
        System.out.println("O autor do livro é: "  + livro.getAutor());

        System.out.println("=====Livro2====");
        livro1.exibirInformacoes();
        livro1.setAutor("Lucas");
        System.out.println("O autor do livro é: "  + livro1.getAutor());
    }


}
