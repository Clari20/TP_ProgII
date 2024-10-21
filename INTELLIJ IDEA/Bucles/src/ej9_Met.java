public class ej9_Met {
        public static void main(String[] args) {
            double[] preciosOriginales = {100.0, 200.0, 150.0, 300.0, 250.0};

            calcularPrecioFinal(preciosOriginales);
        }

        public static void calcularPrecioFinal(double[] preciosOriginales) {
            final double DESCUENTO = 0.10;
            System.out.println("Precios finales con descuento aplicado:");
            for (double precio : preciosOriginales) {
                double descuento = precio * DESCUENTO;
                double precioFinal = precio - descuento;
                System.out.println("Precio original: $" + precio + " - Descuento: $" + descuento + " - Precio final: $" + precioFinal);
            }
        }
    }

