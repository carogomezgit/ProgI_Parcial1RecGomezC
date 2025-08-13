package model;

public class Android extends Smartphone {
  // metodo constructor con super
  public Android(String nroSerie, String modelo, int anio, float costoBase) {
    super(nroSerie, modelo, anio, costoBase);
  }

  @Override
  public String getTipo() {
    return "Android";
  }

  @Override
  public float calcularCostoFinal() { // calcular segun tipo
    return getAnio() * 0.15f;
  }
}
