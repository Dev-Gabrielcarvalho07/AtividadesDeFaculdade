public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(String marca , String modelo, int Ano, int cilindradas){
        super(marca , modelo , Ano);
        this.cilindradas = cilindradas;

    }
    @Override
    public void acelerar(){
        velocidadeAtual += 40 ;
        System.out.println("Acelerando a Moto " + modelo + " Velocidade atual: " + velocidadeAtual + " km/h ");

    }
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Quantidade de cilindradas: " + cilindradas + " cc ");
    }
}
