package HyP;

public abstract class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago();

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }
}

