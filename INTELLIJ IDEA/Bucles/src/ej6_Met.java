public class ej6_Met {
        public static void main(String[] args) {
            double[] facturas = {100.0, 200.0, 150.0, 300.0, 250.0};

            calcularImpuesto(facturas);
        }

        public static void calcularImpuesto(double[] facturas) {
            final double TASA_IMPUESTO = 0.21;
            System.out.println("Facturas con impuesto aplicado:");
            for (double factura : facturas) {
                double impuesto = factura * TASA_IMPUESTO;
                double total = factura + impuesto;
                System.out.println("Factura original: $" + factura + " - Impuesto: $" + impuesto + " - Total: $" + total);
            }
        }
    }
