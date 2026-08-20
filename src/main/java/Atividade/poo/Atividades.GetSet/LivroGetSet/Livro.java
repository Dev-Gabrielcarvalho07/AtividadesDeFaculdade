public class Livro {
    public String Titulo;
    private String Autor;
    protected int Paginas;

    public Livro(String Titulo,  int Paginas) {
        this.Titulo = Titulo;
        this.Paginas = Paginas;
    }


    public void exibirInformacoes() {
        System.out.println("Titulo: " + Titulo);

        System.out.println("Paginas: " + Paginas);

    }
    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    public String getAutor(){
        return Autor;
    }
}
