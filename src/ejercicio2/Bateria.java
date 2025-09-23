package ejercicio2;

public class Bateria {
    private final String modelo;
    private final int capacidadmAh;

    public Bateria(String modelo, int capacidadmAh) {
        this.modelo = modelo;
        this.capacidadmAh = capacidadmAh;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCapacidadmAh() {
        return capacidadmAh;
    }
}
