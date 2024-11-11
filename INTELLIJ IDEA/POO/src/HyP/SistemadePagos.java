package HyP;

public class SistemadePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        TarjetaCredito tarjetaCredito1 = new TarjetaCredito("Juan Pérez", "1234567890123456", "12/25", "123");
        TarjetaCredito tarjetaCredito2 = new TarjetaCredito("Ana García", "9876543210987654", "10/24", "456");
        PayPal payPal1 = new PayPal("Carlos López", "1234567890", "carlos.lopez@example.com");

        pagos.agregarMetodoPago(tarjetaCredito1);
        pagos.agregarMetodoPago(tarjetaCredito2);
        pagos.agregarMetodoPago(payPal1);

        System.out.println("Información de los métodos de pago:");
        pagos.mostrarInformacion();

        System.out.println("Realizando pagos:");
        pagos.realizarPagos();

        System.out.println("Cancelando pagos:");
        pagos.cancelarPagos();
    }
}

