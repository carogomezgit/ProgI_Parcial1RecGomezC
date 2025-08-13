package model;

public class IPhone extends Smartphone {
  // metodo constructor con super
  public IPhone(String nroSerie, String modelo, int anio, float costoBase) {
    super(nroSerie, modelo, anio, costoBase);
  }

  @Override
  public String getTipo() {
    return "iPhone";
  }

  @Override
  public float calcularCostoFinal() { // calcular segun año
    if (getAnio() < 2023) {
      return getAnio() * 0.10f;
    }
    return getAnio();
  }
}
