public class Overclock implements Modo {
  @Override
  public double consumo(Equipo equipo) {
    return equipo.getConsumoBase() * 2;
  }

  @Override
  public double produccion(Equipo equipo) {
    return equipo.produccionEnOverclock();
  }

  public void quemar(Equipo equipo) {
    equipo.seQuemo();
  }
}
