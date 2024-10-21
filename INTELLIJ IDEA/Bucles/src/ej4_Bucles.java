import java.util.Scanner;

public class ej4_Bucles {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double totalVentas = 0.0;

            for (int i = 1; i <= 7; i++) {
                System.out.print("Ingrese las ventas del día " + i + ": ");
                double ventasDiarias = scanner.nextDouble();
                totalVentas += ventasDiarias;
            }

            System.out.println("El total de ventas de la semana es: $" + totalVentas);
        }
    }


