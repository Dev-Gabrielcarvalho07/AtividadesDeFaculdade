public class Veiculo{
    String marca ;
    String modelo;
    int Ano ;
    double velocidadeAtual;


    public Veiculo(String marca , String modelo, int Ano){
        this.marca = marca;
        this.modelo = modelo;
        this.Ano = Ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(){
        System.out.println("O veiculo está em movimento na velocidade de:" + velocidadeAtual + "km/h");

    }
    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual = 0.0;
            System.out.println("Freando o veículo Velocidade atual: 0 km/h");
        } else {
            System.out.println("O veículo já está parado.");
        }
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + Ano + ", Velocidade: " + velocidadeAtual + " km/h");
    }
}
