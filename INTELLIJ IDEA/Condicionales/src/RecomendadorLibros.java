import java.util.Scanner;

public class RecomendadorLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu género de libro favorito?");
        System.out.println("1. Fantasía");
        System.out.println("2. Misterio");
        System.out.println("3. Romance");
        System.out.println("4. Ciencia ficción");
        System.out.print("Selecciona una opción (1-4): ");

        int opcion = scanner.nextInt();

        String recomendacion;

        switch (opcion) {
            case 1:
                recomendacion = "Te recomiendo 'El Señor de los Anillos'.";
                break;
            case 2:
                recomendacion = "Te recomiendo 'Sherlock Holmes'.";
                break;
            case 3:
                recomendacion = "Te recomiendo 'Orgullo y prejuicio'.";
                break;
            case 4:
                recomendacion = "Te recomiendo 'La cancion del lobo'";
                break;
            default:
                recomendacion = "Opción no válida. Por favor, selecciona una opción entre 1 y 4.";
                break;
        }

        System.out.println(recomendacion);

        scanner.close();
    }
}
