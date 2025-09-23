package ejercicio1;

public class Foto {
    private final byte[] imagen;
    private final String formato;

    public Foto(byte[] imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    public byte[] getImagen() {
        return imagen;
    }
    public String getFormato() {
        return formato;
    }
}