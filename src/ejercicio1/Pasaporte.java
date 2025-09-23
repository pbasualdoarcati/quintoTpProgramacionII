package ejercicio1;
import java.time.LocalDate;

public class Pasaporte {
    private final String numero;
    private final LocalDate fechaEmision;
    private final Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;            
        this.titular = titular;     
        if (titular != null) titular.setPasaporte(this);
    }

    public String getNumero() {
        return numero;
    }
    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
    public Foto getFoto() {
        return foto;
    }
    public Titular getTitular() {
        return titular;
    }
    
}