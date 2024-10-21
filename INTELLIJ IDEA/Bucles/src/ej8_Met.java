public class ej8_Met {
        public static void main(String[] args) {
            String[] empleados = {"Empleado1", "Empleado2", "Empleado3", "Empleado4", "Empleado5"};
            int[] horasTrabajadas = {40, 35, 45, 30, 50};

            calcularPagoSemanal(empleados, horasTrabajadas);
        }

        public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
            final double TARIFA_POR_HORA = 15.0;
            System.out.println("Pago semanal de los empleados:");
            for (int i = 0; i < empleados.length; i++) {
                double pago = horasTrabajadas[i] * TARIFA_POR_HORA;
                System.out.println(empleados[i] + " - Horas trabajadas: " + horasTrabajadas[i] + " - Pago: $" + pago);
            }
        }
    }

