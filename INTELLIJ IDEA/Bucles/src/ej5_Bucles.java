import java.util.Scanner;

public class ej5_Bucles {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de empleados: ");
            int numEmpleados = scanner.nextInt();

            for (int i = 1; i <= numEmpleados; i++) {
                System.out.print("Ingrese las horas trabajadas por el empleado " + i + ": ");
                int horasTrabajadas = scanner.nextInt();
                if (horasTrabajadas > 40) {
                    int horasExtras = horasTrabajadas - 40;
                    System.out.println("El empleado " + i + " trabajó " + horasExtras + " horas extras.");
                }
            }
        }
    }


