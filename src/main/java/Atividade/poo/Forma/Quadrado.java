public class Quadrado extends Forma{
    public int lado;

    public Quadrado( double calculo , int lado){
        super(calculo);
        this.lado = lado;
    }
    @Override
    public void calcularArea(){
        super.calcularArea();
        System.out.println("Calculo de  area Quadrado:" + (lado * lado));
    }
}
