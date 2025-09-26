package ejercicio10;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Carolina Mendoza", "27889900");
        CuentaBancaria cuenta = new CuentaBancaria("0170286700000012345678", 75500.50, "pass456", "2025-12-10");
        titular.setCuenta(cuenta);
        
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("DNI: " + cuenta.getTitular().getDni());
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Código de Seguridad: " + cuenta.getClave().getCodigo());
        System.out.println("Última Modificación: " + cuenta.getClave().getUltimaModificacion());
    }
}
