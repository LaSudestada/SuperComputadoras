public class AhorroEnergia implements Modo {
  @Override
  public double consumo(Equipo equipo) {
    return 200;
  }

  @Override
  public double produccion(Equipo equipo) {
    return consumo(equipo) / equipo.getConsumoBase() * equipo.getUnidadesDeComputoBase();
  }
}
