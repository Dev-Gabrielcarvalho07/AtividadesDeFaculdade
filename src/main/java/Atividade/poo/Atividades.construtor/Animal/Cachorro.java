public class Cachorro extends Animal{
    public String raca;
    public Cachorro( String nome , int peso , String raca){
        super(nome , peso);
        this.raca = raca;
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Raça:" + raca);
    }
}