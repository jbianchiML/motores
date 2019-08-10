public class MotorCombustible extends Motor implements IRefrigerante{

    public MotorCombustible(Double temperatura, int potencia) {
        super(temperatura, potencia);
    }

    @Override
    public void refrigerar() {
        this.temperatura=this.temperatura*0.20;
    }
}
