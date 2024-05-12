public class Standard implements Modo {
  @Override
  public double consumo(Equipo equipo) {
    return equipo.getConsumoBase();
  }

  @Override
  public double produccion(Equipo equipo) {
    return equipo.getUnidadesDeComputoBase();
  }
}
