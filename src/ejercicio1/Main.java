package ejercicio1;

public class Main {
            
    public static void main(String[] args) {
        Foto foto = new Foto("retrato_oficial.png", "PNG");
        Titular titular = new Titular("María Fernanda López", "34567890");
        Pasaporte pasaporte = new Pasaporte("B9876543", "2024-08-22", foto, titular);
        
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte N°: " + titular.getPasaporte().getNumero());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
}
