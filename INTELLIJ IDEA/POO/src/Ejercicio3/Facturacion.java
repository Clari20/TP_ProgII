package Ejercicio3;

import java.util.Scanner;

public class Facturacion {
    private static final String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        System.out.println("Ingrese la fecha de la factura:");
        factura.setFechaFactura(scanner.nextLine());

        System.out.println("Ingrese el número de la factura:");
        long numeroFactura = scanner.nextLong();
        while (numeroFactura <= 0) {
            System.out.println("El número de factura debe ser un número entero mayor a cero. Intente nuevamente:");
            numeroFactura = scanner.nextLong();
        }
        factura.setNumeroFactura(numeroFactura);
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese el nombre del cliente:");
        String cliente = scanner.nextLine();
        while (cliente.trim().isEmpty()) {
            System.out.println("El nombre del cliente no puede estar vacío. Intente nuevamente:");
            cliente = scanner.nextLine();
        }
        factura.setCliente(cliente);

        while (true) {
            System.out.println("Ingrese el código del artículo a facturar (o 'salir' para terminar):");
            String codigoArticulo = scanner.nextLine();

            if (codigoArticulo.equalsIgnoreCase("salir")) {
                break;
            }

            String nombreArticulo = null;
            double precioUnitario = 0;
            boolean encontrado = false;

            for (String[] articulo : articulos) {
                if (articulo[0].equals(codigoArticulo)) {
                    nombreArticulo = articulo[1];
                    precioUnitario = Double.parseDouble(articulo[2]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
                continue;
            }

            System.out.println("Ingrese la cantidad a facturar:");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            double descuentoItem = 0;
            if (cantidad > 5) {
                descuentoItem = precioUnitario * 0.1;
            }

            double subtotal = (precioUnitario * cantidad) - (descuentoItem * cantidad);

            DetalleFactura detalleFactura = new DetalleFactura(codigoArticulo, nombreArticulo, cantidad, precioUnitario, descuentoItem, subtotal);
            factura.agregarDetalleFactura(detalleFactura);
        }

        factura.calcularMontoTotal();

        System.out.println("\nFecha: " + factura.getFechaFactura());
        System.out.println("Número: " + factura.getNumeroFactura());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Código Artículo\tNombre Artículo\tCantidad\tPrecio Unitario\tDescuento Ítem\tSubtotal");

        for (DetalleFactura detalle : factura.getDetallesFactura()) {
            System.out.println(detalle.getCodigoArticulo() + "\t" + detalle.getNombreArticulo() + "\t" + detalle.getCantidad() + "\t" + detalle.getPrecioUnitario() + "\t" + detalle.getDescuentoItem() + "\t" + detalle.getSubtotal());
        }

        System.out.println("Total: " + factura.getTotalCalculadoFactura());
    }
}

