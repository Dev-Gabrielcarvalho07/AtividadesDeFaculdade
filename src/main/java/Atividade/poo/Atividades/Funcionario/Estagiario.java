public class Estagiario extends Funcionario{
    public Estagiario(String nome , double salarioBase ){
    super(nome , salarioBase);
    }
    @Override
    public void calcularSalario(){
        super.calcularSalario();
        System.out.println("Metade do salario Atual:"  + (salarioBase/2  ));
    }

}