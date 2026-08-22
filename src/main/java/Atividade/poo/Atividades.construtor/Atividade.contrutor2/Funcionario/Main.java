/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    public static  void main(String[]args){
        Funcionario funcionario = new Funcionario("gabriel" , 1500);
        Funcionario funcionario1 = new Funcionario(" rafael");

        System.out.println("====Funcionario====");
        funcionario.exibirInformacoes();

        System.out.println("====Funcionario1====");
        funcionario1.exibirInformacoes();
    }

}