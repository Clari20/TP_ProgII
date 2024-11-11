package HyP;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con tarjeta de crédito...");
        System.out.println("Titular: " + titular);
        System.out.println("Número de tarjeta: " + numero);
        System.out.println("Fecha de expiración: " + fechaExpiracion);
        System.out.println("Código de seguridad: " + codigoSeguridad);
        System.out.println("Pago realizado con éxito.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con tarjeta de crédito...");
        System.out.println("Titular: " + titular);
        System.out.println("Número de tarjeta: " + numero);
        System.out.println("Pago cancelado con éxito.");
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }
}

