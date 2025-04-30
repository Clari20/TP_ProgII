import javax.swing.*;
import java.util.Random;
import java.util.jar.JarOutputStream;

public class EjemploDoWhile {
    public static void main(String[] args){
        int nota, intentos = 0;
        Random numRandom = new Random();
        do {
            JOptionPane.showMessageDialog(null, "Tenes "+(4-intentos)+" intentos");
            nota = numRandom.nextInt(0, 10);
            intentos ++;
            JOptionPane.showMessageDialog(null, "Su nota es "+nota);
            if (nota>=6){
                JOptionPane.showMessageDialog(null, "Felicidades, aprobaste!");
            } else {
                JOptionPane.showMessageDialog(null, "Desarpobaste");
            }
        } while (intentos <4 && nota<6);

    }
}
