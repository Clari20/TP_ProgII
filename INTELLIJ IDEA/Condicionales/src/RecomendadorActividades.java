import java.util.Scanner;

public class RecomendadorActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo te sientes hoy?");
        System.out.println("1. Feliz");
        System.out.println("2. Triste");
        System.out.println("3. Enérgico");
        System.out.println("4. Relajado");
        System.out.print("Selecciona una opción (1-4): ");

        int opcion = scanner.nextInt();

        String recomendacion;

        switch (opcion) {
            case 1:
                recomendacion = "Te recomiendo salir a pasear y disfrutar del día.";
                break;
            case 2:
                recomendacion = "Te recomiendo ver una película que te guste o hablar con un amigo.";
                break;
            case 3:
                recomendacion = "Te recomiendo hacer ejercicio o practicar un hobby que te guste.";
                break;
            case 4:
                recomendacion = "Te recomiendo leer un libro o meditar para mantener la calma.";
                break;
            default:
                recomendacion = "Opción no válida. Por favor, selecciona una opción entre 1 y 4.";
                break;
        }

        System.out.println(recomendacion);

        scanner.close();
    }
}

