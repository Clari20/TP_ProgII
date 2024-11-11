package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        ArrayList<Plato> platosMenu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre del plato (o 'salir' para terminar):");
            String nombreCompleto = scanner.nextLine();

            if (nombreCompleto.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingrese el precio del plato:");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("¿Es una bebida? (si/no):");
            boolean esBebida = scanner.nextLine().equalsIgnoreCase("si");

            Plato plato = new Plato(nombreCompleto, precio, esBebida);

            if (!esBebida) {
                while (true) {
                    System.out.println("Ingrese el nombre del ingrediente (o 'salir' para terminar):");
                    String nombreIngrediente = scanner.nextLine();

                    if (nombreIngrediente.equalsIgnoreCase("salir")) {
                        break;
                    }

                    System.out.println("Ingrese la cantidad del ingrediente:");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea

                    System.out.println("Ingrese la unidad de medida del ingrediente:");
                    String unidadDeMedida = scanner.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidad, unidadDeMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            platosMenu.add(plato);
        }

        System.out.println("\nPRACTICA ASOCIACIONES Y DEPENDENCIA\n");
        System.out.println("MENÚ");

        for (Plato plato : platosMenu) {
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $ " + plato.getPrecio());

            if (!plato.isEsBebida()) {
                System.out.println("Ingredientes:");
                System.out.println("Nombre\tCantidad\tUnidad de Medida");

                for (Ingrediente ingrediente : plato.getIngredientes()) {
                    System.out.println(ingrediente.getNombre() + "\t" + ingrediente.getCantidad() + "\t" + ingrediente.getUnidadDeMedida());
                }
            }

            System.out.println();
        }
    }
}

