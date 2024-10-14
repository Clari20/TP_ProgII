import java.util.Scanner;

public class DescuentoProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Seleccione la categoría del cliente:");
        System.out.println("1. Estudiante");
        System.out.println("2. Adulto");
        System.out.println("3. Jubilado");
        System.out.print("Seleccione una opción (1-3): ");

        int opcion = scanner.nextInt();

        double descuento = 0.0;

        switch (opcion) {
            case 1:
                descuento = 0.10; // 10% de descuento para estudiantes
                break;
            case 2:
                descuento = 0.05; // 5% de descuento para adultos
                break;
            case 3:
                descuento = 0.15; // 15% de descuento para jubilados
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 3.");
                return;
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("El precio final después del descuento es: " + precioFinal);

        scanner.close();
    }
}
