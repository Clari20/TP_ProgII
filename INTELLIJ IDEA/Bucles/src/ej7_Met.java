public class ej7_Met {
        public static void main(String[] args) {
            double[] compras = {300.0, 600.0, 450.0, 700.0, 200.0};

            aplicarDescuento(compras);
        }

        public static void aplicarDescuento(double[] compras) {
            final double DESCUENTO = 0.15;
            System.out.println("Compras con descuento aplicado:");
            for (double compra : compras) {
                if (compra > 500) {
                    double descuento = compra * DESCUENTO;
                    double total = compra - descuento;
                    System.out.println("Compra original: $" + compra + " - Descuento: $" + descuento + " - Total: $" + total);
                }
            }
        }
    }

