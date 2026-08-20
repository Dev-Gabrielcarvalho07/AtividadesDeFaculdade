/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2023, 4);
        Moto moto = new Moto("Honda", "CBR", 2022, 600);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2021, 15.0);


        System.out.println("======Carro======");
        carro.exibirInformacoes();
        carro.acelerar();

        carro.frear();
        System.out.println();

        System.out.println("=======Moto=======");
        moto.exibirInformacoes();
        moto.acelerar();
        moto.frear();
        System.out.println();

        System.out.println("=======Caminhao=======");
        caminhao.exibirInformacoes();
        caminhao.acelerar();
        caminhao.frear();
    }
}
