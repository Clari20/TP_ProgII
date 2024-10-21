import java.util.Scanner;

public class ej2_Bucles {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de empleados: ");
            int numEmpleados = scanner.nextInt();

            final double TARIFA_POR_HORA = 15.0;

            for (int i = 1; i <= numEmpleados; i++) {
                System.out.print("Ingrese las horas trabajadas por el empleado " + i + ": ");
                int horasTrabajadas = scanner.nextInt();
                double salario = horasTrabajadas * TARIFA_POR_HORA;
                System.out.println("El salario del empleado " + i + " es: $" + salario);
            }
        }
    }


