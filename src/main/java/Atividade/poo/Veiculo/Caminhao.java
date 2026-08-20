public class Caminhao extends Veiculo{
    private  double CapacidadeDeCarga;
    public Caminhao(String modelo , String marca , int Ano , double CapacidadeDeCarga){
        super(modelo , marca, Ano);
        this.CapacidadeDeCarga = CapacidadeDeCarga;

    }
    @Override
    public void acelerar(){
        velocidadeAtual += 10.0;
        System.out.println(" Acelerando o Caminhao " + modelo + "   Velocidade Atual " + velocidadeAtual + " km/h ");

    }
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println(" Capacidade de carga do Caminhão: " + CapacidadeDeCarga + " Toneladas ");
    }


}
