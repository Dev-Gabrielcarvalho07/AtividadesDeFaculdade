public class Carro{
    String Modelo;
    String Marca;
    int Ano;
    public Carro(String Modelo , String Marca , int Ano){
        this.Modelo = Modelo;
        this.Marca = Marca ;
        this.Ano = Ano;
    }
    public void ExibirInformacoes(){
        System.out.println("MODELO:" + Modelo);
        System.out.println("MARCA:" + Marca);
        System.out.println("ANO:" + Ano);
    }
}