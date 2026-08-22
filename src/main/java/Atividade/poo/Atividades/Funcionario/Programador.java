public  class Programador extends Funcionario{
    private int HorasExtras;
    public Programador(String nome , double salarioBase , int HorasExtras){
        super(nome, salarioBase);
        this.HorasExtras = HorasExtras;

    }
    @Override
    public void calcularSalario(){
        super.calcularSalario();
        System.out.println("salario atual com Horas Extras:" + (salarioBase + HorasExtras*50));
    }
}