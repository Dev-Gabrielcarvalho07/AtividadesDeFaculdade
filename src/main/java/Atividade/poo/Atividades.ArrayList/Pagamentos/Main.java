/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Pagamento> pagamentos = new ArrayList<>();


        System.out.println("===Formas de pagamentos===");
        pagamentos.add( new PagCredito());
        pagamentos.add( new PagDebito());
        pagamentos.add( new PagPix());


        for (Pagamento p : pagamentos) {
            p.realizarPag();
        }
    }
}