import java.util.Scanner;

public class Habitos_saludables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día duermes? ");
        double horasSueno = scanner.nextDouble();

        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        double horasEjercicio = scanner.nextDouble();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();

        String evaluacion;

        if (horasSueno >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            evaluacion = "Tus hábitos saludables son excelentes. ¡Sigue así!";
        } else if (horasSueno >= 6 && horasEjercicio >= 0.5 && comidasSaludables >= 2) {
            evaluacion = "Tus hábitos saludables son buenos, pero podrías mejorar un poco.";
        } else {
            evaluacion = "Tus hábitos saludables necesitan mejorar. Considera dormir más, hacer más ejercicio y consumir más comidas saludables.";
        }

        System.out.println("Evaluación de tus hábitos saludables: " + evaluacion);

        scanner.close();
    }
}

