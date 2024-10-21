public class ej1_Met {
        public static void main(String[] args) {
            double[] ventas = {100.0, 200.0, 150.0, 300.0, 250.0, 180.0, 220.0, 280.0, 320.0, 290.0,
                    350.0, 400.0, 380.0, 420.0, 450.0, 480.0, 500.0, 520.0, 550.0, 580.0,
                    600.0, 620.0, 650.0, 680.0, 700.0, 720.0, 750.0, 780.0, 800.0, 820.0};

            double totalIngresos = calcularIngresosMensuales(ventas);
            System.out.println("El total de ingresos mensuales es: $" + totalIngresos);
        }

        public static double calcularIngresosMensuales(double[] ventas) {
            double total = 0.0;
            for (double venta : ventas) {
                total += venta;
            }
            return total;
        }
    }


