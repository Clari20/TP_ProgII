import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int A[], B[], C[];
        A = new int[4];
        B = new int[4];
        C = new int[4];

        
    }

    public void cargarArreglo(int[] arreglo) {
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = lectura.nextInt();

        }

    }


    public static void sumarArreglos(int[] arreglo1, int[] arreglo2, int[] arreglo3) {
        for (int i = 0; i < arreglo3.length; i++) {
            arreglo3[i] = arreglo2[i] + arreglo1[i];
        }
    }

    public static void mostrarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento "+i+ " " +arreglo[i]);
        }
    }

}
