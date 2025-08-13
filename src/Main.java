import model.Android;
import model.IPhone;
import model.Smartphone;
import model.Taller;


public class Main {
  public static void main(String[] args) throws Exception {

    Taller s = new Taller();

    // crear objetos
    Smartphone smartphone1 = new Android("ABC123", "Samsung", 2025, 130000);
    Smartphone smartphone2 = new IPhone("DEF456", "iPhone 14", 2022, 200000);
    Smartphone smartphone3 = new Android("GHI789", "Motorola", 2023, 150000);

    // agregar objetos
    s.agregarSmartphone(smartphone1);
    s.agregarSmartphone(smartphone2);
    s.agregarSmartphone(smartphone3);

    // mostrar objetos smartphones agregados
    s.mostrarPendientes();

    // reparar uno con numero de serie (metodo)
    s.repararSmartphone("ABC123");

    // manejar exception si no esta en lista de espera
    s.repararSmartphone("JKL123"); // (objeto que no existe)

  }
}