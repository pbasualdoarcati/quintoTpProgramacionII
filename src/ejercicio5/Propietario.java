package ejercicio5;

public class Propietario {
    private final String nombre;
    private final String dni;
    private Computadora computadora; 

    public Propietario(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    void setComputadora(Computadora c) { this.computadora = c; } 
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Computadora getComputadora() { return computadora; }

}