public class Aluno{
    public String nome ;
    private int Idade;
    protected String matricula;

    public Aluno(String nome ,   String matricula){
        this.nome=nome;
        this.matricula=matricula;
    }

    public void exibirDados(){
        System.out.println("nome: " +  nome);
        System.out.println("Matricula: " +  matricula);
    }

    private void validardeIdade(){
        if(Idade > 0){
            System.out.println("Idade válidada com sucesso !");
        }
        else{
            Idade -= 0;
            System.out.println("Idade inválida !");
        }

    }
    public int getIdade(){
        return Idade;

    }
    public void setIdade(int Idade){
        this.Idade = Idade;
    }
}
