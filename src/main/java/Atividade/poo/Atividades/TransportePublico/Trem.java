public class Trem extends Transporte{
    private int distancia;
    public Trem(int tarifaBase , int distancia){
        super(tarifaBase);
        this.distancia = distancia;

    }
    @Override
    public double calcularTarifa(){
        return tarifaBase + distancia*0.8;
    }
}