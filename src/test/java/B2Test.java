import org.junit.Assert;
import org.junit.Test;

public class B2Test {
  @Test
  public void pruebaConsumoDeUnaB2StandardCon4Chips() {
    Microchip m1 = new Microchip();

    B2 b2 = new B2(4, new Standard());

    for (int i = 0; i < 4 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertEquals(210, b2.getConsumo(), 0);
  }
  @Test
  public void pruebaComputoDeUnaB2StandardCon3Chips() {
    Microchip m1 = new Microchip();

    B2 b2 = new B2(3, new Standard());
    for (int i = 0; i < 3 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertEquals(300, b2.getUnidadesDeComputo(), 0);
  }

  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////

  @Test
  public void pruebaConsumoDeUnaB2StandardCon9Chips() {
    Microchip m1 = new Microchip();

    B2 b2 = new B2(9, new Standard());

    for (int i = 0; i < 9 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertEquals(460, b2.getConsumo(), 0);
  }

  @Test
  public void pruebaComputoDeUnaB2StandardCon9Chips() {
    Microchip m1 = new Microchip();

    B2 b2 = new B2(15, new Standard());
    for (int i = 0; i < 9 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertEquals(800, b2.getUnidadesDeComputo(), 0);
  }

  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////

  @Test
  public void pruebaAgregarMasChipsDeLosPosibles() {
    Microchip m1 = new Microchip();
    B2 b2 = new B2(5, new Standard());
    for (int i = 0; i < 5 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertThrows(RuntimeException.class, () -> {b2.agregarMicrochip(m1);});
  }

  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////

  @Test
  public void pruebaConsumoDeUnaB2De5ChipsOverclockeada() {
    Microchip m1 = new Microchip();
    B2 b2 = new B2(5, new Overclock());
    for (int i = 0; i < 5 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertEquals(520,b2.getConsumo(),0);
  }

  @Test
  public void pruebaComputoDeUnaB2De5ChipsOverclockeada() {
    Microchip m1 = new Microchip();
    B2 b2 = new B2(5, new Overclock());
    for (int i = 0; i < 5 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertEquals(600,b2.getUnidadesDeComputo(),0);
  }

  ////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////

  @Test
  public void pruebaConsumoDeUnaB2De6ChipsEnAhorro() {
    Microchip m1 = new Microchip();
    B2 b2 = new B2(6, new AhorroEnergia());
    for (int i = 0; i < 6 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertEquals(200,b2.getConsumo(),0);
  }

  @Test
  public void pruebaComputoDeUnaB2De6ChipsEnAhorro() {
    Microchip m1 = new Microchip();
    B2 b2 = new B2(6, new AhorroEnergia());
    for (int i = 0; i < 6 ; i++) {
      b2.agregarMicrochip(m1);
    }

    Assert.assertTrue(b2.getUnidadesDeComputo() < 400);
  }

}
