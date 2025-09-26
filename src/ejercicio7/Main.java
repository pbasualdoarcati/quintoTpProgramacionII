package ejercicio7;

public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Roberto Fernández", "B456789");
        Motor motor = new Motor("Nafta", "ENG987654");
        Vehiculo vehiculo = new Vehiculo("XY789ZW", "Ford Focus", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Licencia: " + vehiculo.getConductor().getLicencia());
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
        System.out.println("N° Serie Motor: " + vehiculo.getMotor().getNumeroSerie());
    }
}
