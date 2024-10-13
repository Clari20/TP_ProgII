import java.util.Scanner;

public class CalorieCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double weight = scanner.nextDouble();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duration = scanner.nextInt();

        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.print("Ingrese el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String exerciseType = scanner.nextLine().toLowerCase();

        double caloriesPerMinute = 0;

        switch (exerciseType) {
            case "correr":
                caloriesPerMinute = 0.07;
                break;
            case "nadar":
                caloriesPerMinute = 0.08;
                break;
            case "andar en bicicleta":
                caloriesPerMinute = 0.06;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                return;
        }

        double caloriesBurned = weight * duration * caloriesPerMinute;

        System.out.printf("Calorías quemadas: %.2f\n", caloriesBurned);
    }
}

