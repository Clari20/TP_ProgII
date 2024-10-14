

import java.util.Scanner;

public class Felicidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese varios factores de felicidad
        System.out.print("Ingrese su nivel de satisfacción con la vida (1-10): ");
        int satisfaccion = scanner.nextInt();

        System.out.print("Ingrese su nivel de estrés (1-10): ");
        int estres = scanner.nextInt();

        System.out.print("Ingrese su nivel de salud (1-10): ");
        int salud = scanner.nextInt();

        // Calcular el índice de felicidad
        double indiceFelicidad = (satisfaccion + salud - estres) / 3.0;

        // Imprimir el índice de felicidad
        System.out.println("Su índice de felicidad es: " + indiceFelicidad);

        scanner.close();
    }
}


