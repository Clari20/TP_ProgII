import java.util.Scanner;

public class RecomendadorPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu género de película favorito?");
        System.out.println("1. Acción");
        System.out.println("2. Comedia");
        System.out.println("3. Drama/Musical");
        System.out.println("4. Disney");
        System.out.print("Selecciona una opción (1-4): ");

        int opcion = scanner.nextInt();

        String recomendacion;

        switch (opcion) {
            case 1:
                recomendacion = "Te recomiendo 'Avengers: Era de Ultron'.";
                break;
            case 2:
                recomendacion = "Te recomiendo 'Son como niños'.";
                break;
            case 3:
                recomendacion = "Te recomiendo 'Tik tik Bum'.";
                break;
            case 4:
                recomendacion = "Te recomiendo 'Mulan'.";
                break;
            default:
                recomendacion = "Opción no válida. Por favor, selecciona una opción entre 1 y 4.";
                break;
        }

        System.out.println(recomendacion);

        scanner.close();
    }
}
