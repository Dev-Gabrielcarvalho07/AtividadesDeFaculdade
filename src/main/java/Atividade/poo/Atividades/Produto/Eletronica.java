public class Eletronica extends Produto{

    public Eletronica(String nome , double preco ){
        super(nome ,preco);

    }
    @Override
    public double calcularPrecoFinal(){
        return preco - preco*0.1;

    }
}