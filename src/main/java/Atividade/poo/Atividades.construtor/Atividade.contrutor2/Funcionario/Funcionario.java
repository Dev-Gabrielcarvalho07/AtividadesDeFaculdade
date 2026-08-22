public class Funcionario{
    String nome;
    double salarioB;
    double salarioL;

    public Funcionario(String nome , double salarioB){
        this.nome=nome;
        this.salarioB=salarioB;
        this.salarioL=salarioB - (salarioB*0.10);

    }

    public Funcionario(String nome){
        this.nome=nome;
        this.salarioB=2000;
        this.salarioL=salarioB - (salarioB*0.10);
    }
    public void  exibirInformacoes(){
        System.out.println("Nome:" + nome);
        System.out.println("Salário Bruto: " + salarioB);
        System.out.println("Salário Liquído: " + salarioL);

    }

}