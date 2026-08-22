public class Alimento extends Produto{
    public Alimento(String nome , double preco){
        super(nome , preco);

    }
    @Override
    public double calcularPrecoFinal(){
        return preco;
    }
}