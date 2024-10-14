import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Selecciona una opción (1-3): ");

        int opcionUsuario = scanner.nextInt();
        int opcionComputadora = random.nextInt(3) + 1;

        String eleccionUsuario = "";
        String eleccionComputadora = "";

        switch (opcionUsuario) {
            case 1:
                eleccionUsuario = "Piedra";
                break;
            case 2:
                eleccionUsuario = "Papel";
                break;
            case 3:
                eleccionUsuario = "Tijera";
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 3.");
                return;
        }

        switch (opcionComputadora) {
            case 1:
                eleccionComputadora = "Piedra";
                break;
            case 2:
                eleccionComputadora = "Papel";
                break;
            case 3:
                eleccionComputadora = "Tijera";
                break;
        }

        System.out.println("Tú elegiste: " + eleccionUsuario);
        System.out.println("La computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("Es un empate!");
        } else if ((eleccionUsuario.equals("Piedra") && eleccionComputadora.equals("Tijera")) ||
                (eleccionUsuario.equals("Papel") && eleccionComputadora.equals("Piedra")) ||
                (eleccionUsuario.equals("Tijera") && eleccionComputadora.equals("Papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();
    }
}

