package persona;

public class CuentaBancaria {
    static long count=0;
    private long numero;
    private long saldo;

    public CuentaBancaria() {
        numero = ++count;
    }
    public CuentaBancaria(long saldo){
        numero = ++count;
        this.saldo = saldo;
    }
    public void deposito(long valor){
        this.saldo += valor;
    }
    public void retiro(long valor){
        if (valor>this.saldo){
            System.out.println("Uy paaa, estas re pobre");
            System.out.println("No te alcanza ni pa retirar eso");
            return;
        }
        this.saldo -= valor;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        CuentaBancaria.count = count;
    }

    public long getNumero() {
        return numero;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}
