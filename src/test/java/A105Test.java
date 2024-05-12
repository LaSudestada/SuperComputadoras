import org.junit.Assert;
import org.junit.Test;

public class A105Test {
  @Test
  public void pruebaConsumoDeUnaA105Standar() {
    Equipo a105 = new A105(new Standard());

    Assert.assertEquals(300, a105.getConsumo(),0);
  }

  @Test
  public void pruebaComputoDeUnaA105Standar() {
    Equipo a105 = new A105(new Standard());

    Assert.assertEquals(600, a105.getUnidadesDeComputo(),0);
  }

  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////

  @Test
  public void pruebaConsumoDeUnaA105Overclockeada() {
    Equipo a105 = new A105(new Overclock());

    Assert.assertEquals(600, a105.getConsumo(),0);
  }

  @Test
  public void pruebaComputoDeUnaA105Overclockeada() {
    Equipo a105 = new A105(new Overclock());

    Assert.assertEquals(780, a105.getUnidadesDeComputo(),0);
  }

  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////

  @Test
  public void pruebaConsumoDeUnaA105EnAhorro() {
    Equipo a105 = new A105(new AhorroEnergia());

    Assert.assertEquals(200, a105.getConsumo(),0);
  }

  @Test
  public void pruebaComputoDeUnaA105EnAhorro() {
    Equipo a105 = new A105(new AhorroEnergia());

    Assert.assertEquals(400, a105.getUnidadesDeComputo(),0);
  }
}
