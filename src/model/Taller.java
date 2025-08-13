package model;

import exception.SmartphoneNoDisponibleExcepcion;

public class Taller {

  // atributos
  private Smartphone[] smartphones;
  private float ganancias;
  private int cantidadDeReparaciones;

  // metodo constructor
  public Taller () {
    smartphones = new Smartphone[10];
    ganancias = 0;
    cantidadDeReparaciones = 0;
  }

  // metodos
  public void agregarSmartphone(Smartphone s) throws Exception {
    if (cantidadDeReparaciones <= smartphones.length) {
      smartphones[cantidadDeReparaciones] = s;
      cantidadDeReparaciones++;
    }else {
      throw new SmartphoneNoDisponibleExcepcion("Se ha excedido el limite de dispositivos a reparar");
    }
  }

  public void mostrarPendientes() {
    for (int i = 0; i < cantidadDeReparaciones; i++) {
      Smartphone s = smartphones[i];
      System.out.println();
    }
  }

  public void repararSmartphone(String nroSerie) throws Exception {
    boolean estadoEnEspera = false;
    // comparar nro de serie con uno existente
    for (int i = 0; i < cantidadDeReparaciones; i++) {
      if (smartphones[i] != null && smartphones[i].getNroSerie().equals(nroSerie)) {
        float precioFinal = smartphones[i].calcularCostoFinal();
        System.out.println("El dispositivo " + nroSerie + " ha sido reparado con exito");
        ganancias += precioFinal;

        // quitar elemento del array
        for (int j = i; j < cantidadDeReparaciones - 1; j++) {
          smartphones[j] = smartphones[j + 1];
        }
        smartphones[cantidadDeReparaciones - 1] = null;
        cantidadDeReparaciones--;
        estadoEnEspera = true;
        break;

      } else if (!estadoEnEspera) { // si no esta en lista de espera
        throw new SmartphoneNoDisponibleExcepcion("El dispositivo " + nroSerie + " no está en lista de espera");
      }
    }
  }
}
