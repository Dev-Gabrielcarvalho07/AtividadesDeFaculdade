public class Engenheiro extends Funcionario{
    private double Bonificacao;
    public Engenheiro(String nome, double salario, double Bonificacao){
        super(nome , salario);
        this.Bonificacao = Bonificacao;
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Bonificacao: " + Bonificacao);
        System.out.println("---------------------------");
    }
}
