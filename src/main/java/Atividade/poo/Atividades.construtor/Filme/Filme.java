public class Filme{
    String titulo;
    String diretor;
    int duracao;
    public Filme(String titulo , String diretor , int duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }
    public Filme(String titulo){
        this.titulo = titulo;
        this.diretor = "Desconhecido";
        this.duracao = 120;
    }
    public void exibirInformacoes(){
        System.out.println("Titulo:" + titulo);
        System.out.println("Diretor:" + diretor);
        System.out.println("duracão:" + duracao);
    }




}