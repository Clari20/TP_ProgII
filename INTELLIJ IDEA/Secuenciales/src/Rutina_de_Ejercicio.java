

import java.util.Scanner;

public class Rutina_de_Ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nivel de condición física (principiante, intermedio, avanzado): ");
        String fitnessLevel = scanner.nextLine().toLowerCase();

        String[] routine;

        if (fitnessLevel.equals("principiante")) {
            routine = new String[]{
                    "Lunes: Caminar 30 minutos",
                    "Martes: Yoga 20 minutos",
                    "Miércoles: Descanso",
                    "Jueves: Caminar 30 minutos",
                    "Viernes: Yoga 20 minutos",
                    "Sábado: Descanso",
                    "Domingo: Descanso"
            };
        } else if (fitnessLevel.equals("intermedio")) {
            routine = new String[]{
                    "Lunes: Correr 45 minutos",
                    "Martes: Nadar 30 minutos",
                    "Miércoles: Descanso",
                    "Jueves: Andar en bicicleta 45 minutos",
                    "Viernes: Correr 45 minutos",
                    "Sábado: Nadar 30 minutos",
                    "Domingo: Descanso"
            };
        } else if (fitnessLevel.equals("avanzado")) {
            routine = new String[]{
                    "Lunes: Correr 60 minutos",
                    "Martes: Nadar 45 minutos",
                    "Miércoles: Entrenamiento de fuerza 60 minutos",
                    "Jueves: Andar en bicicleta 60 minutos",
                    "Viernes: Correr 60 minutos",
                    "Sábado: Nadar 45 minutos",
                    "Domingo: Descanso"
            };
        } else {
            System.out.println("Nivel de condición física no válido.");
            return;
        }

        System.out.println("Rutina de ejercicio semanal:");
        for (String day : routine) {
            System.out.println(day);
        }
    }
}

