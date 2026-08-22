public class Onibus extends Transporte{
    private int distancia;
    public Onibus(int tarifaBase , int distancia){
        super(tarifaBase);
        this.distancia = distancia;
    }
    @Override
    public double calcularTarifa(){
        return tarifaBase + distancia*0.5;
    }
}