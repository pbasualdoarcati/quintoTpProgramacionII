package ejercicio4;

public class Cliente {
    private final String nombre;
    private final String dni;
    private TarjetaDeCredito tarjeta; // bidireccional

    public Cliente(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    void setTarjeta(TarjetaDeCredito t) { this.tarjeta = t; } 
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
}