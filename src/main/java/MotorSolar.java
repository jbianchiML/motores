public class MotorSolar extends Motor implements IRefrigerante{


    public MotorSolar(Double temperatura, int potencia) {
        super(temperatura, potencia);
    }


    @Override
    public void refrigerar() {
        this.temperatura=this.temperatura*0.20;
    }

}
