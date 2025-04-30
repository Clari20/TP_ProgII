import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int [] numeros = new int [6];
        int [] Notas = new int [10];
        int suma = 0;
        double promedio;
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < Notas.length; i++){
            Notas[i]=lectura.nextInt();
            suma += Notas[i];


        }
        promedio = suma/Notas.length;
    }
}