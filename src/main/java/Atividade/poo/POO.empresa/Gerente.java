public class Gerente extends Funcionario{
    private double Bonificacao;
    public Gerente(String nome , double salario ,double Bonificacao){
        super(nome, salario);
        this.Bonificacao = Bonificacao;
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes ();
        System.out.println("Bonificacao: " + Bonificacao);
        System.out.println("---------------------------");
    }
}
