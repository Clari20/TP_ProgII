import java.util.Scanner;

public class ej6_BuclesAnidados {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número N: ");
            int n = scanner.nextInt();

            for (int i = 2; i <= n; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


