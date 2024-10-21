public class ej4_Met {
        public static void main(String[] args) {
            String[] clientes = {"Cliente1", "Cliente2", "Cliente3", "Cliente4", "Cliente5"};
            int[] compras = {8, 12, 5, 15, 10};

            calcularDescuentos(clientes, compras);
        }

        public static void calcularDescuentos(String[] clientes, int[] compras) {
            System.out.println("Clientes con descuento del 10%:");
            for (int i = 0; i < clientes.length; i++) {
                if (compras[i] > 10) {
                    System.out.println(clientes[i] + " - Compras: " + compras[i] + " - Descuento: 10%");
                }
            }
        }
    }
