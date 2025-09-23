package ejercicio1;

public class Titular {
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    void setPasaporte(Pasaporte p) { this.pasaporte = p; }
   

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public Pasaporte getPasaporte() {
        return pasaporte;
    }

}