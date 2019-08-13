import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorTest {


    @Test
    public void crearMotor() {
        Motor m= new Motor((double) 0,0);
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void crearMotorNuclear() {
        MotorNuclear m= new MotorNuclear(0.1,0);
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void crearMotorCombustible() {
        MotorCombustible m= new MotorCombustible(0.1,1);
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void crearMotorSolar() {
        MotorSolar m= new MotorSolar(0.1,1);
        Assertions.assertThat(m).isNotNull();
    }

    @Test
    public void subirPotencia(){
        Motor m = new Motor(0.1,1);
        int potencia=m.getPotencia();
        m.subirPotencia();
        int potenciaSubida=m.getPotencia();
        Assertions.assertThat(potencia < potenciaSubida).isTrue();
    }

    @Test
    public void subirTemperatura(){
        Motor m = new Motor(0.1,4);
        Double temperatura = m.getTemperatura();
        m.subirPotencia();
        Double temperaturaSubida = m.getTemperatura();
        Assertions.assertThat(temperatura < temperaturaSubida).isTrue();
    }

    @Test
    public void bajarPotencia(){
        Motor m = new Motor(0.1,3);
        int potencia = m.getPotencia();
        m.bajarPotencia();
        int potenciaBajada = m.getPotencia();
        Assertions.assertThat(potencia>potenciaBajada).isTrue();
    }

    @Test
    public void bajarTemperatura(){
        Motor m = new Motor(0.1,3);
        Double temperatura = m.getTemperatura();
        m.bajarPotencia();
        Double temperaturaSubida = m.getTemperatura();
        Assertions.assertThat(temperatura > temperaturaSubida).isTrue();
    }

    /*@Test
    public void noBajarPotenciaANegativa (){
        Motor m = new Motor(0.1,2);
        int potenciaMantenida = m.getPotencia();
        m.bajarPotencia();
        Assertions.assertThat(potenciaMantenida == m.getPotencia()).isTrue();
    }
*/

}
