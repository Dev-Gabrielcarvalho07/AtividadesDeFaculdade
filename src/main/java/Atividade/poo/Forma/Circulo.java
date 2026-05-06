public class Circulo extends Forma{
    public int Raio;
    public Circulo(double calculo , int Raio){
        super( calculo);
        this.Raio = Raio;
    }
    @Override
    public void calcularArea(){
        super.calcularArea();
        System.out.println("Calculo de area circulo:" +  Math.PI * (Raio * Raio));
    }
}
