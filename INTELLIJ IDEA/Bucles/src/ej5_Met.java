public class ej5_Met {
        public static void main(String[] args) {
            int[] calificaciones = {4, 5, 3, 4, 5, 2, 4, 3, 5, 4};

            double promedio = calcularPromedioSatisfaccion(calificaciones);
            System.out.println("El promedio de satisfacción del cliente es: " + promedio);
        }

        public static double calcularPromedioSatisfaccion(int[] calificaciones) {
            int total = 0;
            for (int calificacion : calificaciones) {
                total += calificacion;
            }
            return (double) total / calificaciones.length;
        }
    }


