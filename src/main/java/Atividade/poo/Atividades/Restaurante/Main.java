/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        PedidoMesa pedidomesa = new PedidoMesa(150.0);
        PedidoDelivery pedidodelivery = new PedidoDelivery(34.0);

        System.out.println("VALOR FINAL RESTAURANTE:");
        System.out.println("=== Pedido de Mesa ===");
        System.out.println("Valor final com taxa de serviço: " + pedidomesa.CalcularValorFinal());

        System.out.println("=== Pedido de Delivery ===");
        System.out.println("Valor final com taxa de entrega: " + pedidodelivery.CalcularValorFinal());
    }
}