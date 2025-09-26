package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Central", "30-12345678-9");
        Cliente cliente = new Cliente("Laura Martínez", "30123456");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/26", banco);
        
        cliente.setTarjeta(tarjeta);
        
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tarjeta N°: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }
}
