package ejercicio2;

public class Usuario {
    private final String nombre;
    private final String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    void setCelular(Celular c) { this.celular = c; }
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public Celular getCelular() {
        return celular;
    }
}