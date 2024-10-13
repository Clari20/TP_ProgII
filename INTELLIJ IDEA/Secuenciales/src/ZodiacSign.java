

import java.util.Scanner;

public class ZodiacSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String input = scanner.nextLine();

        String[] parts = input.split("/");
        if (parts.length != 3) {
            System.out.println("Formato de fecha incorrecto. Por favor, use DD/MM/AAAA.");
            return;
        }

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);

        String sign = getZodiacSign(day, month);
        String horoscope = getHoroscopeMessage(sign);

        System.out.println("Su signo del zodiaco es: " + sign);
        System.out.println("Su horóscopo es: " + horoscope);
    }

    private static String getZodiacSign(int day, int month) {
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Acuario";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Piscis";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Géminis";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cáncer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricornio";
        } else {
            return "Fecha no válida";
        }
    }

    private static String getHoroscopeMessage(String sign) {
        switch (sign) {
            case "Acuario":
                return "Hoy es un buen día para ser creativo y explorar nuevas ideas.";
            case "Piscis":
                return "Confía en tu intuición y sigue tus sueños.";
            case "Aries":
                return "Tu energía y determinación te llevarán lejos hoy.";
            case "Tauro":
                return "Disfruta de la estabilidad y la paz que te rodea.";
            case "Géminis":
                return "Es un buen momento para comunicarte y compartir tus pensamientos.";
            case "Cáncer":
                return "Conéctate con tus emociones y cuida de tus seres queridos.";
            case "Leo":
                return "Brilla con tu carisma y liderazgo.";
            case "Virgo":
                return "Tu atención al detalle y organización serán clave hoy.";
            case "Libra":
                return "Busca el equilibrio y la armonía en tus relaciones.";
            case "Escorpio":
                return "Explora tus pasiones y misterios.";
            case "Sagitario":
                return "Aprovecha tu espíritu aventurero y explora nuevos horizontes.";
            case "Capricornio":
                return "Tu disciplina y ambición te ayudarán a alcanzar tus metas.";
            default:
                return "No se pudo determinar el horóscopo.";
        }
    }
}
