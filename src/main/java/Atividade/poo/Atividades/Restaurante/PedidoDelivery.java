public class PedidoDelivery extends Pedido{
    public PedidoDelivery(double valor){
    super(valor);

    }
    @Override
    public double CalcularValorFinal(){
        return valor + valor*0.05;
    }
}