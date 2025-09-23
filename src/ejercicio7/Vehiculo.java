package ejercicio7;

public class Vehiculo {
    private final String patente;
    private final String modelo;
    private Motor motor;        
    private Conductor conductor; 

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        if (conductor != null) conductor.setVehiculo(this);
    }
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
}
