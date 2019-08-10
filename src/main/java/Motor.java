public class Motor {

    protected Double temperatura ;
    protected int potencia = 0;

    public Motor(Double temperatura, int potencia){
        this.temperatura = temperatura;
        this.potencia = potencia;
    }

     public void subirPotencia(){
            potencia=+3;
            temperatura=temperatura+2;
     }

    public void bajarPotencia(){
            potencia=-2;
            temperatura=temperatura-1;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public int getPotencia() {
        return potencia;
    }

    /*  No es correcto, ya que el metodo subir potencia no es setear un valor, sino que tiene un proceso atras que aumenta en base a la actual
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }*/

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }
}
