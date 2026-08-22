/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[3];

        formas[0] = new Circulo(3);
        formas[1] = new Quadrado(5);
        formas[2] = new Retangulo(3, 6);

        System.out.println("===Calculo de Ârea===");
        for (Forma f : formas) {
            System.out.println(f.toString() + " - Área: " + f.calcularArea());

        }
    }
}