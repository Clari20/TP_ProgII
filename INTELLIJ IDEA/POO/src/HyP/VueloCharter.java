package HyP;


public class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        // Aplicar una promoción, por ejemplo, un 10% de descuento
        precioTotal *= 0.9;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
}

