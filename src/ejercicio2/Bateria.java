package ejercicio2;

public class Bateria {
    private  String modelo;
    private  int capacidadmAh;

    public Bateria(String modelo, int capacidadmAh) {
        this.modelo = modelo;
        this.capacidadmAh = capacidadmAh;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidadmAh;
    }

    public void setCapacidad(int capacidad) {
        this.capacidadmAh = capacidad;
    }
}
