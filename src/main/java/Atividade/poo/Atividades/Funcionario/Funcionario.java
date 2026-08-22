public class Funcionario{
    String nome ;
    double salarioBase;

    public Funcionario(String nome , double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void calcularSalario(){
        System.out.println("Nome:" + nome);
        System.out.println("Salario Base:" + salarioBase);

    }


}