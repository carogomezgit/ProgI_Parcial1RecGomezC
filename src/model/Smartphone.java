package model;

public abstract class Smartphone implements Reparacion {

  // atributos
  private String nroSerie;
  private String modelo;
  private int anio;
  private float costoBase;

  // metodo constructor
  public Smartphone (String nroSerie, String modelo, int anio, float costoBase){
    this.nroSerie = nroSerie;
    this.modelo = modelo;
    this.anio = anio;
    this.costoBase = costoBase;
  }

  // getters y setters
  public String getNroSerie() {
    return nroSerie;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAnio() {
    return anio;
  }

  public float getCostoBase() {
    return costoBase;
  }

  public void setNroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setAnio (int anio) {
    this.anio = anio;
  }

  public void setCostoBase (float costoBase) {
    this.costoBase = costoBase;
  }

  // metodo abstracto
  public abstract String getTipo();
}
