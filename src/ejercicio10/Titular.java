package ejercicio10;

public class Titular {
    private final String nombre;
    private final String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    void setCuenta(CuentaBancaria c) { this.cuenta = c; }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public CuentaBancaria getCuenta() { return cuenta; }
}