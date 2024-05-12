public class A105 extends Equipo {

  @Override
  public double getConsumoBase() {
    return 300;
  }

  @Override
  public double getConsumo() {
    return this.modo.consumo(this);
  }

  @Override
  public double getUnidadesDeComputoBase() {
    return 600;
  }

  @Override
  public double getUnidadesDeComputo() {
    return this.modo.produccion(this);
  }

  @Override
  public double produccionEnOverclock() {
    return getUnidadesDeComputoBase() * 1.3;
  }

  //CONSTRUCTOR
  public A105(Modo modo) {
    this.modo = modo;
  }
}
