/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrumento> instrumentos = new ArrayList<>();
        System.out.println("====Instrumentos====");
        instrumentos.add(new Violao());
        instrumentos.add(new Piano());
        instrumentos.add(new Bateria());

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}