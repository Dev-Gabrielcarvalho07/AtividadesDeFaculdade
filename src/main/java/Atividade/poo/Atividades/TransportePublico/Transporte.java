public class Transporte{
    int tarifaBase;
    public Transporte(int tarifaBase){
        this.tarifaBase = tarifaBase;
    }
    public double  calcularTarifa(){
        return tarifaBase ;
    }

}