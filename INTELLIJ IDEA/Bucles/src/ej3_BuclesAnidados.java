import java.util.Scanner;

public class ej3_BuclesAnidados {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número N: ");
            int n = scanner.nextInt();

            long suma = 0;
            for (int i = 0; i <= n; i++) {
                suma += factorial(i);
            }
            System.out.println("La suma de los factoriales desde 0 hasta " + n + " es: " + suma);
        }

        public static long factorial(int numero) {
            long resultado = 1;
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }


