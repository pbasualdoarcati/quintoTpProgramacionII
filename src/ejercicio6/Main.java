package ejercicio6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Valentina Morales", "555-4433");
        Mesa mesa = new Mesa(12, 6);
        Reserva reserva = new Reserva("2025-12-24", "20:30", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Teléfono: " + reserva.getCliente().getTelefono());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());
        System.out.println("Capacidad: " + reserva.getMesa().getCapacidad() + " personas");
        System.out.println("Fecha: " + reserva.getFecha());
        System.out.println("Hora: " + reserva.getHora());
    }
}
