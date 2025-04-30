import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.jar.JarOutputStream;

public class Ejemplo_Metodo {
    public static void main(String[] args) {
        int numero1, numero2;
        //imprimirHola(nombre:"Pepe");
        Random numRandom = new Random();
        //numero1 = leerNumero();
        //numero2 = leerNumero();
        //JOptionPane.showMessageDialog(null, "La suma es "+sumar(numero1, numero2));
    }
    //public static void imprimirHola() {
       // System.out.println("Hola "+nombre);
   // }

    //public static int leerNumero(){
        //int numero;  //variable local
       // numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresaste el numero: "+numero));
        //return numero;
    //}

    public static int sumar(int numero1, int numero2){
        int resultado;
        resultado = numero1+numero2;
        return resultado;
    }
}
