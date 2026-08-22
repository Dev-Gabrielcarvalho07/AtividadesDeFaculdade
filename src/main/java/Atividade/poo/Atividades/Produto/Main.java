/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {

        Eletronica eletronica = new Eletronica("Celular", 7000.0);
        Roupa roupa = new Roupa("Casaco Luis Vuitton", 92000.0);
        Alimento alimento = new Alimento("Picanha", 60.0);

        System.out.println("E -COMMERCE:");
        System.out.println("====Eletronicos====");
        System.out.println("Valor final: R$" + eletronica.calcularPrecoFinal());

        System.out.println("====Roupa====");
        System.out.println("Valor final: R$" + roupa.calcularPrecoFinal());

        System.out.println("====Alimentos====");
        System.out.println("Valor final: R$" + alimento.calcularPrecoFinal());
    }
}