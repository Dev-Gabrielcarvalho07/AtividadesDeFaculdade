 public class Produto{
    String nome;
    int preco;
    int quantidade;

    public Produto(String nome , int preco , int quantidade){
        this.nome =nome;
        this.preco = preco;
        this.quantidade =quantidade;
    }
    public Produto(String nome , int preco ){
        this(nome , preco , 1);

    }
    public void exibirInformacoes(){
        System.out.println("Nome:" + nome);
        System.out.println("Preço:" + preco);
        System.out.println("Quantidade:" + quantidade);
    }




}