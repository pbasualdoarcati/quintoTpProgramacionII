package ejercicio12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("María Elena Rodriguez", "27-98765432-1");
        Impuesto impuesto = new Impuesto(125750.75, contribuyente);
        Calculadora calculadora = new Calculadora();
        
        System.out.println("=== Sistema de Cálculo de Impuestos ===");
        System.out.println("Contribuyente: " + contribuyente.getNombre());
        System.out.println("CUIL: " + contribuyente.getCuil());
        System.out.println();
        calculadora.calcular(impuesto);
    }
}
