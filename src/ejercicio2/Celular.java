package ejercicio2;

public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private Bateria bateria;
    private Usuario usuario; 
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;   
        this.usuario = usuario;   
        if (usuario != null) usuario.setCelular(this);
    }

    public String getImei() {
        return imei;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Bateria getBateria() {
        return bateria;
    }
    public Usuario getUsuario() {
        return usuario;
    }

}