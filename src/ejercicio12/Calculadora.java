package ejercicio12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto(); 
        System.out.println("Calculando impuesto: " + total);
    }
}