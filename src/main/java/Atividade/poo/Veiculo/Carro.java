public class Carro extends Veiculo{
    private  int NumeroDePortas;
    public Carro(String marca , String modelo, int Ano, int NumeroDePortas){
        super(marca , modelo , Ano);
        this.NumeroDePortas= NumeroDePortas;

    }
    @Override
    public void acelerar(){
        velocidadeAtual +=20.0;
        System.out.println("Acelerando o carro  " + modelo + "  Velocidade atual: " + velocidadeAtual + " km/h");

    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Portas: " + NumeroDePortas);
    }
}

