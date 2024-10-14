

import java.util.Scanner;

public class Clases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario cuántas horas al día puede estudiar
        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasDiarias = 0;

        try {
            horasDiarias = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor, ingresa un número válido.");
            scanner.close();
            return;
        }

        // Definir las materias
        String[] materias = {"SO", "Programacion I", "Laboratorio", "Org Empresarial", "Matematica"};

        // Generar el plan de estudio semanal
        System.out.println("Plan de estudio semanal:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Día " + (i + 1) + ":");
            for (String materia : materias) {
                System.out.println("  " + materia + ": " + (horasDiarias / materias.length) + " horas");
            }
        }

        scanner.close();
    }
}


