import java.util.Scanner;

public class ej1_Bucles {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalHoras = 0;

            String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};

            for (String actividad : actividades) {
                System.out.print("Ingrese las horas dedicadas a " + actividad + ": ");
                int horas = scanner.nextInt();
                totalHoras += horas;
            }

            System.out.println("El tiempo total dedicado a las actividades es: " + totalHoras + " horas.");
        }
    }


