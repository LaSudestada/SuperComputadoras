import java.util.ArrayList;
import java.util.List;

public class B2 extends Equipo {
  int capacidadMicrochips;
  int cantidadMicrochips;
  final double consumoBasePlacaMadre = 10;
  List<Microchip> microchips = new ArrayList<>();

  public void agregarMicrochip(Microchip microchip) {
    if (this.cantidadMicrochips < this.capacidadMicrochips ) {
      microchips.add(microchip);
      this.cantidadMicrochips++;
    } else {
      throw new RuntimeException("Se superó la capacidad de microchips");
    }

  }

  private double getConsumoMicrochips() {
    return microchips
        .stream()
        .map(Microchip::getConsumo)
        .reduce(0.0, Double::sum);
  }

  @Override
  public double getConsumoBase() {
    return consumoBasePlacaMadre + getConsumoMicrochips();
  }

  @Override
  public double getConsumo() {
    return this.modo.consumo(this);
  }

  private double getUnidadesDeComputoMicrochips() {
    return microchips
        .stream()
        .map(Microchip::getUnidadesDeComputo)
        .reduce(0.0, Double::sum);
  }

  @Override
  public double getUnidadesDeComputoBase() {
    return getUnidadesDeComputoMicrochips() < 800 ? getUnidadesDeComputoMicrochips() : 800;
  }

  @Override
  public double getUnidadesDeComputo() {
    return this.modo.produccion(this);
  }

  @Override
  public double produccionEnOverclock() {
    return microchips
        .stream()
        .map(microchip -> microchip.getUnidadesDeComputo() + 20)
        .reduce(0.0, Double::sum);
  }


  //CONSTRUCTOR
  public B2(int capacidadMicrochips, Modo modo) {
    this.capacidadMicrochips = capacidadMicrochips;
    this.modo = modo;
  }
}

