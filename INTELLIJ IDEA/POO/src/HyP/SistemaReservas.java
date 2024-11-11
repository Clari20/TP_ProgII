package HyP;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vueloRegular1 = new VueloRegular("VR001", "Madrid", "Barcelona", "2023-10-01", 100, 100);
        VueloRegular vueloRegular2 = new VueloRegular("VR002", "Paris", "Lyon", "2023-10-02", 150, 120);
        VueloCharter vueloCharter1 = new VueloCharter("VC001", "New York", "Los Angeles", "2023-10-03", 5000);

        reservas.agregarVuelo(vueloRegular1);
        reservas.agregarVuelo(vueloRegular2);
        reservas.agregarVuelo(vueloCharter1);

        System.out.println("Información de los vuelos antes de aplicar promociones:");
        reservas.mostrarInformacion();

        reservas.aplicarPromociones();

        System.out.println("Información de los vuelos después de aplicar promociones:");
        reservas.mostrarInformacion();

        System.out.println("Precio total de las reservas: " + reservas.calcularPrecioTotal());
    }
}

