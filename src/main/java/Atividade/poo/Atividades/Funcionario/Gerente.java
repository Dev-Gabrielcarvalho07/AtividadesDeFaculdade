public class Gerente extends Funcionario{
    private double bonus;
    public Gerente(String nome , double salarioBase , double bonus){
    super(nome  , salarioBase);
    this.bonus = bonus;
    }

    @Override
    public void calcularSalario(){
        super.calcularSalario();
        System.out.println("Salario atual com acrescimo de bonus:" + (salarioBase + bonus));
    }


}