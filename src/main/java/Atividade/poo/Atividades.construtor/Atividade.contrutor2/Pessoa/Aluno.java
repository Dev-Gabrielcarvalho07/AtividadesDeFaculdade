public class Aluno extends Pessoa{
    String curso;

    public Aluno(String nome , int idade ,String curso){
        super(nome , idade);
        this.curso=curso;

    }

    public Aluno(String nome , String curso){
        super(nome , 18 );
        this.curso=curso;
    }
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Curso:" + curso);
    }

}