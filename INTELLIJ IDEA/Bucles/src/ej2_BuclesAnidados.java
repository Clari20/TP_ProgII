import java.util.Scanner;

public class ej2_BuclesAnidados {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número N: ");
            int n = scanner.nextInt();

            for (int i = 0; i <= n; i++) {
                System.out.println("Factorial de " + i + " es: " + factorial(i));
            }
        }

        public static long factorial(int numero) {
            long resultado = 1;
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }


