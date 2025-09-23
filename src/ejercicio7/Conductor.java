package ejercicio7;

public class Conductor {
    private final String nombre;
    private final String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) { this.nombre = nombre; this.licencia = licencia; }
    void setVehiculo(Vehiculo v) { this.vehiculo = v; } 
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
    public Vehiculo getVehiculo() { return vehiculo; }
}
