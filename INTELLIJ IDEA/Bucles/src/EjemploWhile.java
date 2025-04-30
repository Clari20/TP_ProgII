
import javax.swing.*;

public class EjemploWhile {
    public static void main (String[] args) {
        String password= "", contrasenia= "UTN";
        int intentos=0;
        while (!password.equals(contrasenia) && intentos < 3){
            password= JOptionPane.showInputDialog("Ingrese su contraseña: ");
            intentos++;
            password=password.toUpperCase();

            if (!password.equals(contrasenia))
                JOptionPane.showMessageDialog(null, "Le quedan "+(3-intentos)+" intentos");
        }
        if (intentos==3 && !password.equals(contrasenia)){
            JOptionPane.showMessageDialog(null, "Clave bloqueada");
        } else {
            JOptionPane.showMessageDialog(null, "Ha ingresado al sistema!!");
        }
    }

}