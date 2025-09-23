package ejercicio10;

public class CuentaBancaria {
    private final String cbu;
    private double saldo;
    private final ClaveSeguridad clave; 
    private Titular titular;            

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        if (titular != null) titular.setCuenta(this);
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular getTitular() { return titular; }
}