public class ej1_BuclesAnidados {

        public static void main(String[] args) {
            for (int i = 1; i <= 1000; i++) {
                if (esPerfecto(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean esPerfecto(int numero) {
            int suma = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    suma += i;
                }
            }
            return suma == numero;
        }
    }


