package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Ana Sofía García", "87654321");
        Computadora pc = new Computadora("Dell", "DL789012", "MSI Gaming", "X570");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Número de Serie: " + pc.getNumeroSerie());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());
        System.out.println("Chipset: " + pc.getPlacaMadre().getChipset());
    }
}
