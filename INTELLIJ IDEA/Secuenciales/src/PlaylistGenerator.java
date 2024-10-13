

import java.util.Scanner;

public class PlaylistGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String mood = scanner.nextLine().toLowerCase();

        String[] playlist;

        switch (mood) {
            case "feliz":
                playlist = new String[]{
                        "Happy - Pharrell Williams",
                        "Don't Stop Me Now - Queen",
                        "Good Life - OneRepublic"
                };
                break;
            case "triste":
                playlist = new String[]{
                        "Someone Like You - Adele",
                        "Fix You - Coldplay",
                        "Hurt - Johnny Cash"
                };
                break;
            case "enérgico":
                playlist = new String[]{
                        "Eye of the Tiger - Survivor",
                        "Uptown Funk - Mark Ronson ft. Bruno Mars",
                        "Can't Hold Us - Macklemore & Ryan Lewis"
                };
                break;
            case "relajado":
                playlist = new String[]{
                        "Weightless - Marconi Union",
                        "Clair de Lune - Claude Debussy",
                        "The Sound of Silence - Simon & Garfunkel"
                };
                break;
            default:
                System.out.println("Estado de ánimo no válido.");
                return;
        }

        System.out.println("Lista de reproducción sugerida:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}

