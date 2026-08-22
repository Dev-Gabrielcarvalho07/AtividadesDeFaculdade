public class Livro{
    String Titulo;
    String Autor;
    int Pagina;

    public Livro(String Titulo, String Autor , int Pagina){
        this.Titulo =Titulo;
        this.Autor = "Desconhecido";
        this.Pagina = 0 ;
    }
    public Livro(String Titulo){
        this.Titulo = Titulo;
    }

    public void ExibirInformacoes(){
        System.out.println("Titulo:" + Titulo);
        System.out.println("Autor:" + Autor);
        System.out.println("Pagina:" + Pagina);

    }

}