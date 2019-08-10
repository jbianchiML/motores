import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorTest {


    @Test
    public void crearMotor() {
        Motor m= new Motor();
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void crearMotorNuclear() {
        MotorNuclear m= new MotorNuclear();
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void crearMotorCombustible() {
        MotorCombustible m= new MotorCombustible();
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void crearMotorSolar() {
        MotorSolar m= new MotorSolar();
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void subirPotencia(){
        Motor m = new Motor();
        int potencia=m.getPotencia();
        m.subirPotencia();
        int potenciaSubida=m.getPotencia();
        Assertions.assertThat(potencia < potenciaSubida).isTrue();
    }

    @Test
    public void subirTemperatura(){
        Motor m = new Motor();
        int temperatura = m.getTemperatura();
        m.subirPotencia();
        int temperaturaSubida = m.getTemperatura();
        Assertions.assertThat(temperatura < temperaturaSubida).isTrue();
    }

    @Test
    public void bajarPotencia(){
        Motor m = new Motor();
        int potencia = m.getPotencia();
        m.bajarPotencia();
        int potenciaBajada = m.getPotencia();
        Assertions.assertThat(potencia>potenciaBajada).isTrue();
    }

    @Test
    public void bajarTemperatura(){
        Motor m = new Motor();
        int temperatura = m.getTemperatura();
        m.bajarPotencia();
        int temperaturaSubida = m.getTemperatura();
        Assertions.assertThat(temperatura > temperaturaSubida).isTrue();
    }

    @Test
    public void noBajarPotenciaANegativa (){
        Motor m = new Motor();
        int potenciaMantenida = m.getPotencia();
        m.bajarPotencia();
        Assertions.assertThat(potenciaMantenida == m.getPotencia()).isTrue();
    }


}
