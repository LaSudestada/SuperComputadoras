public abstract class Equipo {
  Modo modo;
  Estado estado = Estado.ACTIVO;

  abstract double getConsumoBase();

  abstract double getConsumo();

  abstract double getUnidadesDeComputoBase();

  abstract double getUnidadesDeComputo();

  abstract double produccionEnOverclock();

  public void seQuemo() {
    estado = Estado.QUEMADO;
  }
}
