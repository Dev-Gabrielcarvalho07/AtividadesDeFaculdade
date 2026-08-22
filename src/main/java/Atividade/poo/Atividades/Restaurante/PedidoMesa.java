public class PedidoMesa extends Pedido{
    public PedidoMesa(double valor ){
    super(valor);
    }
    @Override
    public double CalcularValorFinal(){
       return valor + valor*0.10;
    }
}