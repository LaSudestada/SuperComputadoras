import java.util.ArrayList;
import java.util.List;

public class SuperComputadora {
  final Estado estado = Estado.ACTIVO;
  Modo modo;
  List<Equipo> equipos = new ArrayList<>();

  public void agregarEquipo(Equipo equipo) {
    equipos.add(equipo);
  }

  public double consumoTotal() {
    return equipos
        .stream()
        .map(Equipo::getConsumo)
        .reduce(0.0, Double::sum);
  }

  public double computoTotal() {
    return equipos
        .stream()
        .map(Equipo::getUnidadesDeComputo)
        .reduce(0.0, Double::sum);
  }


}
