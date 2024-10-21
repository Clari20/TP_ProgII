public class ej2_Met {
        public static void main(String[] args) {
            String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
            int[] stocks = {3, 10, 2, 6, 4};

            generarReporteBajoStock(productos, stocks);
        }

        public static void generarReporteBajoStock(String[] productos, int[] stocks) {
            System.out.println("Productos con bajo stock:");
            for (int i = 0; i < productos.length; i++) {
                if (stocks[i] < 5) {
                    System.out.println(productos[i] + " - Unidades: " + stocks[i]);
                }
            }
        }
    }

