public class Produto{
    public String nome ;
    private double preco;
    protected int quantidade;
    public Produto(String nome ,  int quantidade){
        this.nome=nome;
        this.quantidade=quantidade;
    }
    public void venderProduto(int unidades){
        if(unidades > quantidade){
            System.out.println("Erro: estoque insuficiente");
        }
        else{
            quantidade -= unidades;
            System.out.println("Venda realizada com sucesso!");
        }


    }
    public void exibirInformacoes(){
        System.out.println("Nome do Produto:" + nome);
        System.out.println("Quantidade em estoque:" + quantidade);
    }
    public double getpreco(){
        return preco;
    }
    public void setpreco(double preco){
        this.preco = preco;

    }


}
