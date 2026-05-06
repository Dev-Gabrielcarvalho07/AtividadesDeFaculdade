public class Retangulo extends Forma{
    public int base;
    public int altura;
    public Retangulo( double calculo , int base, int altura){
        super(calculo);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calculoArea(){
        super.calcularArea();
        System.out.pritln("Calculo de area Retangulo:" + base * altura);
    }
}
