public class Animal{
    String nome ;
    int peso;
    public Animal( String nome , int peso){
        this.nome = nome;
        this.peso = peso;
    }
    public void exibirInformacoes(){
        System.out.println("Nome:" + nome);
        System.out.println("Peso:" + peso);
    }
}